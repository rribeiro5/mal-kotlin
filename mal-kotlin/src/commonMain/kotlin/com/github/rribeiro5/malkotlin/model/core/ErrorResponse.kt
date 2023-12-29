package com.github.rribeiro5.malkotlin.model.core

import kotlinx.serialization.Serializable

@Serializable
internal data class ErrorResponse(
    val error: String,
    val message: String
)
