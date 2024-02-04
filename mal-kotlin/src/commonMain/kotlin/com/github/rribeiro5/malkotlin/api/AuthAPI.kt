package com.github.rribeiro5.malkotlin.api

import com.github.rribeiro5.malkotlin.model.auth.AuthTokens
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.forms.submitForm
import io.ktor.http.parameters

private const val CLIENT_ID_PARAMETER = "client_id"
private const val CLIENT_SECRET_PARAMETER = "client_secret"
private const val CODE_PARAMETER = "code"
private const val CODE_VERIFIER_PARAMETER = "code_verifier"
private const val GRANT_TYPE_PARAMETER = "grant_type"
private const val REDIRECT_URI_PARAMETER = "redirect_uri"
private const val REFRESH_TOKEN_PARAMETER = "refresh_token"

private const val CODE_GRANT_TYPE = "authorization_code"
private const val REFRESH_GRANT_TYPE = "refresh_token"

internal class AuthAPI(private val httpClient: HttpClient) {

    suspend fun authorize(
        clientId: String,
        authorizationCode: String,
        codeVerifier: String,
        clientSecret: String? = null,
        redirectUri: String? = null
    ): AuthTokens =
        httpClient.submitForm(
            url = "v1/oauth2/token",
            formParameters = parameters {
                append(CLIENT_ID_PARAMETER, clientId)
                clientSecret?.let { append(CLIENT_SECRET_PARAMETER, it) }
                append(CODE_PARAMETER, authorizationCode)
                append(CODE_VERIFIER_PARAMETER, codeVerifier)
                append(GRANT_TYPE_PARAMETER, CODE_GRANT_TYPE)
                redirectUri?.let { append(REDIRECT_URI_PARAMETER, it) }
            }
        ).body()

    suspend fun refreshTokens(
        clientId: String,
        refreshToken: String,
        clientSecret: String? = null
    ): AuthTokens =
        httpClient.submitForm(
            url = "v1/oauth2/token",
            formParameters = parameters {
                append(CLIENT_ID_PARAMETER, clientId)
                clientSecret?.let { append(CLIENT_SECRET_PARAMETER, it) }
                append(REFRESH_TOKEN_PARAMETER, refreshToken)
                append(GRANT_TYPE_PARAMETER, REFRESH_GRANT_TYPE)
            }
        ).body()
}
