package com.github.rribeiro5.malkotlin.service.ktor

import com.github.rribeiro5.malkotlin.api.AuthAPI
import com.github.rribeiro5.malkotlin.model.auth.AuthTokens
import com.github.rribeiro5.malkotlin.service.AuthService
import com.github.rribeiro5.malkotlin.utils.runKtorRequestCatching

internal class KtorAuthService(private val authAPI: AuthAPI) : AuthService {

    override suspend fun authorize(
        clientId: String,
        authorizationCode: String,
        codeVerifier: String,
        clientSecret: String?,
        redirectUri: String?
    ): Result<AuthTokens> = runKtorRequestCatching {
        authAPI.authorize(
            clientId = clientId,
            authorizationCode = authorizationCode,
            codeVerifier = codeVerifier,
            clientSecret = clientSecret,
            redirectUri = redirectUri
        )
    }

    override suspend fun refreshTokens(
        clientId: String,
        refreshToken: String,
        clientSecret: String?
    ): Result<AuthTokens> = runKtorRequestCatching {
        authAPI.refreshTokens(
            clientId = clientId,
            refreshToken = refreshToken,
            clientSecret = clientSecret
        )
    }
}
