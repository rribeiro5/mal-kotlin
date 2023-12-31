package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimeRecommendationNode(
    val node: AnimeSummary,
    @SerialName("num_recommendations")
    val numRecommendations: Int
)
