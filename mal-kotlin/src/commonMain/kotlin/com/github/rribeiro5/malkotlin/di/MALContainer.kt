package com.github.rribeiro5.malkotlin.di

import com.github.rribeiro5.malkotlin.api.AnimeAPI
import com.github.rribeiro5.malkotlin.api.AuthAPI
import com.github.rribeiro5.malkotlin.api.httpClientEngine
import com.github.rribeiro5.malkotlin.service.AnimeService
import com.github.rribeiro5.malkotlin.service.AuthService
import com.github.rribeiro5.malkotlin.service.ktor.KtorAnimeService
import com.github.rribeiro5.malkotlin.service.ktor.KtorAuthService
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
    val clientId: String,
    val clientSecret: String? = null,
    timeoutMillis: Long?,
    engine: HttpClientEngine = httpClientEngine()
) {

    @OptIn(ExperimentalSerializationApi::class)
    private val httpClient: HttpClient = HttpClient(engine) {
        expectSuccess = true
        defaultRequest {
            url(BASE_URL)
            header(key = API_KEY_HEADER, value = clientId)
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

    private val animeAPI: AnimeAPI = AnimeAPI(httpClient = httpClient)

    private val authAPI: AuthAPI = AuthAPI(httpClient = httpClient)

    val animeService: AnimeService = KtorAnimeService(animeAPI = animeAPI)

    val authService: AuthService = KtorAuthService(authAPI = authAPI)
}
