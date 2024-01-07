package com.github.rribeiro5.malkotlin.utils

import com.github.rribeiro5.malkotlin.exception.MALRequestException
import com.github.rribeiro5.malkotlin.model.core.ErrorResponse
import com.github.rribeiro5.malkotlin.model.core.ErrorType
import io.ktor.client.call.body
import io.ktor.client.plugins.ClientRequestException
import io.ktor.client.plugins.RedirectResponseException
import io.ktor.client.plugins.ResponseException
import io.ktor.client.plugins.ServerResponseException
import io.ktor.http.HttpStatusCode

internal suspend fun <R> runKtorRequestCatching(block: suspend () -> R): Result<R> {
    return try {
        Result.success(block())
    } catch (e: ClientRequestException) {
        val (error, message) = e.getErrorDetails()
        val errorType = when (e.response.status) {
            HttpStatusCode.BadRequest -> ErrorType.BAD_REQUEST
            HttpStatusCode.Unauthorized -> ErrorType.UNAUTHORIZED
            HttpStatusCode.Forbidden -> ErrorType.FORBIDDEN
            HttpStatusCode.NotFound -> ErrorType.NOT_FOUND
            else -> ErrorType.UNKNOWN
        }
        Result.failure(MALRequestException(message, errorType, error))
    } catch (e: ServerResponseException) {
        Result.failure(MALRequestException(e.message, ErrorType.SERVER_ERROR, null))
    } catch (e: RedirectResponseException) {
        Result.failure(MALRequestException(e.message, ErrorType.REDIRECT_ERROR, null))
    } catch (e: Throwable) {
        Result.failure(MALRequestException(e.message.orEmpty(), ErrorType.UNKNOWN, null))
    }
}

private suspend fun ResponseException.getErrorDetails(): ErrorResponse {
    return try {
        response.body()
    } catch (_: Exception) {
        ErrorResponse("", message.orEmpty())
    }
}
