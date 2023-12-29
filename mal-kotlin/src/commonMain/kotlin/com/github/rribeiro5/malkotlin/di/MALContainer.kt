package com.github.rribeiro5.malkotlin.di

import io.ktor.client.HttpClient
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.header

internal class MALContainer(apiKey: String) {

    private val httpClient = HttpClient {
        expectSuccess = true
        defaultRequest {
            url("https://api.myanimelist.net/")
            header(key = "X-MAL-CLIENT-ID", value = apiKey)
        }
    }
}
