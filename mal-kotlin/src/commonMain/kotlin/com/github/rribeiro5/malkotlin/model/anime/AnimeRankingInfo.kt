package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimeRankingInfo(
    val rank: Int,
    @SerialName("previous_rank")
    val previousRank: Int?
)
