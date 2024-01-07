package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimeStatusStatistics(
    val watching: Int,
    val completed: Int,
    @SerialName("on_hold")
    val onHold: Int,
    val dropped: Int,
    @SerialName("plan_to_watch")
    val planToWatch: Int
)
