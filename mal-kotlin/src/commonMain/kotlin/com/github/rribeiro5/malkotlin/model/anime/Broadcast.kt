package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Broadcast(
    @SerialName("day_of_the_week")
    val dayOfTheWeek: BroadcastDay,
    @SerialName("start_time")
    val startTime: String?
)
