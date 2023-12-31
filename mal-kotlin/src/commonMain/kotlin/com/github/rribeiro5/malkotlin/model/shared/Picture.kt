package com.github.rribeiro5.malkotlin.model.shared

import kotlinx.serialization.Serializable

@Serializable
data class Picture(
    val medium: String,
    val large: String?
)
