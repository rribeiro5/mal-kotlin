package com.github.rribeiro5.malkotlin

import com.github.rribeiro5.malkotlin.di.MALContainer
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.MockRequestHandleScope
import io.ktor.client.request.HttpRequestData
import io.ktor.client.request.HttpResponseData

internal typealias RequestMock = suspend MockRequestHandleScope.(HttpRequestData) -> HttpResponseData

internal fun testContainer(
    requestHandler: RequestMock,
    apiKey: String = "123456789",
    timeoutMillis: Long? = null
): MALContainer = MALContainer(
    clientId = apiKey,
    timeoutMillis = timeoutMillis,
    engine = MockEngine(requestHandler)
)
