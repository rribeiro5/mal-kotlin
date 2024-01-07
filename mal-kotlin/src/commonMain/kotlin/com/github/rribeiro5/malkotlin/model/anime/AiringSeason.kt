package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.Serializable

@Serializable
data class AiringSeason(
    val year: Int,
    val season: Season
)
