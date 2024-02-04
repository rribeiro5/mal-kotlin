package com.github.rribeiro5.malkotlin.model.auth

import com.github.rribeiro5.malkotlin.RequestMock
import com.github.rribeiro5.malkotlin.model.core.serverErrorResponse
import io.ktor.client.engine.mock.respond
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.headersOf
import io.ktor.utils.io.ByteReadChannel

internal val authTokenSuccessRequestMock: RequestMock = { _ ->
    respond(
        content = ByteReadChannel(authTokenResponse),
        status = HttpStatusCode.OK,
        headers = headersOf(HttpHeaders.ContentType, "application/json")
    )
}

internal val authTokenErrorRequestMock: RequestMock = { _ ->
    respond(
        content = ByteReadChannel(serverErrorResponse),
        status = HttpStatusCode.InternalServerError,
        headers = headersOf(HttpHeaders.ContentType, "application/json")
    )
}
