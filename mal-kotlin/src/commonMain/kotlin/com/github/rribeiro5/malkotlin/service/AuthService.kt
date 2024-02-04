package com.github.rribeiro5.malkotlin.service

import com.github.rribeiro5.malkotlin.model.auth.AuthTokens

internal interface AuthService {

    suspend fun authorize(
        clientId: String,
        authorizationCode: String,
        codeVerifier: String,
        clientSecret: String? = null,
        redirectUri: String? = null
    ): Result<AuthTokens>

    suspend fun refreshTokens(
        clientId: String,
        refreshToken: String,
        clientSecret: String? = null
    ): Result<AuthTokens>
}
