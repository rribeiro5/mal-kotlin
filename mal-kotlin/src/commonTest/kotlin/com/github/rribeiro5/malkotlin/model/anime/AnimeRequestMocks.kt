package com.github.rribeiro5.malkotlin.model.anime

import com.github.rribeiro5.malkotlin.RequestMock
import com.github.rribeiro5.malkotlin.model.core.notFoundErrorResponse
import com.github.rribeiro5.malkotlin.model.core.serverErrorResponse
import io.ktor.client.engine.mock.respond
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.headersOf
import io.ktor.utils.io.ByteReadChannel

internal val getAnimeListSuccessRequestMock: RequestMock = { _ ->
    respond(
        content = ByteReadChannel(getAnimeListResponse),
        status = HttpStatusCode.OK,
        headers = headersOf(HttpHeaders.ContentType, "application/json")
    )
}

internal val getAnimeListServerErrorRequestMock: RequestMock = { _ ->
    respond(
        content = ByteReadChannel(serverErrorResponse),
        status = HttpStatusCode.InternalServerError,
        headers = headersOf(HttpHeaders.ContentType, "application/json")
    )
}

internal val getAnimeDetailsSuccessRequestMock: RequestMock = { _ ->
    respond(
        content = ByteReadChannel(getAnimeDetailsResponse),
        status = HttpStatusCode.OK,
        headers = headersOf(HttpHeaders.ContentType, "application/json")
    )
}

internal val getAnimeDetailsNotFoundErrorRequestMock: RequestMock = { _ ->
    respond(
        content = ByteReadChannel(notFoundErrorResponse),
        status = HttpStatusCode.NotFound,
        headers = headersOf(HttpHeaders.ContentType, "application/json")
    )
}

internal val getAnimeRankingSuccessRequestMock: RequestMock = { _ ->
    respond(
        content = ByteReadChannel(getAnimeRankingResponse),
        status = HttpStatusCode.OK,
        headers = headersOf(HttpHeaders.ContentType, "application/json")
    )
}

internal val getAnimeRankingServerErrorRequestMock: RequestMock = { _ ->
    respond(
        content = ByteReadChannel(serverErrorResponse),
        status = HttpStatusCode.InternalServerError,
        headers = headersOf(HttpHeaders.ContentType, "application/json")
    )
}

internal val getSeasonalAnimeSuccessRequestMock: RequestMock = { _ ->
    respond(
        content = ByteReadChannel(getSeasonalAnimeResponse),
        status = HttpStatusCode.OK,
        headers = headersOf(HttpHeaders.ContentType, "application/json")
    )
}

internal val getSeasonalAnimeServerErrorRequestMock: RequestMock = { _ ->
    respond(
        content = ByteReadChannel(serverErrorResponse),
        status = HttpStatusCode.InternalServerError,
        headers = headersOf(HttpHeaders.ContentType, "application/json")
    )
}

internal val getSuggestedAnimeSuccessRequestMock: RequestMock = { _ ->
    respond(
        content = ByteReadChannel(getSuggestedAnimeResponse),
        status = HttpStatusCode.OK,
        headers = headersOf(HttpHeaders.ContentType, "application/json")
    )
}

internal val getSuggestedAnimeServerErrorRequestMock: RequestMock = { _ ->
    respond(
        content = ByteReadChannel(serverErrorResponse),
        status = HttpStatusCode.InternalServerError,
        headers = headersOf(HttpHeaders.ContentType, "application/json")
    )
}
