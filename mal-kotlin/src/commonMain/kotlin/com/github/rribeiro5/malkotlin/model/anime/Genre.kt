package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.Serializable

@Serializable
data class Genre(
    val id: Int,
    val name: String
)
