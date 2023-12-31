package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class AnimeWatchStatus {
    @SerialName("watching")
    WATCHING,
    @SerialName("completed")
    COMPLETED,
    @SerialName("on_hold")
    ON_HOLD,
    @SerialName("dropped")
    DROPPED,
    @SerialName("plan_to_watch")
    PLAN_TO_WATCH
}
