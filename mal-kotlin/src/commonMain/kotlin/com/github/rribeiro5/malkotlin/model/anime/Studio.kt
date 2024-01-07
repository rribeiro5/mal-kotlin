package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.Serializable

@Serializable
data class Studio(
    val id: Int,
    val name: String
)
