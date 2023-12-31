package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimeListStatus(
    val status: AnimeWatchStatus?,
    val score: Int?,
    @SerialName("num_episodes_watched")
    val numEpisodesWatched: Int?,
    @SerialName("is_rewatching")
    val isRewatching: Boolean?,
    @SerialName("start_date")
    val startDate: String?,
    @SerialName("finish_date")
    val finishDate: String?,
    val priority: Int?,
    @SerialName("num_times_rewatched")
    val numTimesRewatched: Int?,
    @SerialName("rewatch_value")
    val rewatchValue: Int?,
    val tags: List<String>?,
    val comments: List<String>?,
    @SerialName("updated_at")
    val updatedAt: String?
)
