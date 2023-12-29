package com.github.rribeiro5.malkotlin.di

import com.github.rribeiro5.malkotlin.api.httpClientEngine
import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.header
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

private const val BASE_URL = "https://api.myanimelist.net/"
private const val API_KEY_HEADER = "X-MAL-CLIENT-ID"

internal class MALContainer(
    apiKey: String,
    timeoutMillis: Long?,
    engine: HttpClientEngine = httpClientEngine()
) {

    @OptIn(ExperimentalSerializationApi::class)
    private val httpClient: HttpClient = HttpClient(engine) {
        expectSuccess = true
        defaultRequest {
            url(BASE_URL)
            header(key = API_KEY_HEADER, value = apiKey)
        }
        install(ContentNegotiation) {
            json(
                Json {
                    ignoreUnknownKeys = true
                    explicitNulls = false
                }
            )
        }
        install(HttpTimeout) {
            requestTimeoutMillis = timeoutMillis
        }
    }
}
