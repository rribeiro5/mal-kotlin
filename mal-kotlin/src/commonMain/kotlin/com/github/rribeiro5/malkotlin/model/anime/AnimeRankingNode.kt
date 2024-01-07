package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.Serializable

@Serializable
data class AnimeRankingNode(
    val node: AnimeSummary,
    val ranking: AnimeRankingInfo
)
