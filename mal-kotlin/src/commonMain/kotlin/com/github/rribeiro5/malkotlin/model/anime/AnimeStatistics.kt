package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimeStatistics(
    @SerialName("num_list_users")
    val numListUsers: Int,
    val status: AnimeStatusStatistics
)
