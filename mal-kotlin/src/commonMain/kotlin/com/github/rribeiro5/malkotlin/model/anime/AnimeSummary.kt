package com.github.rribeiro5.malkotlin.model.anime

import com.github.rribeiro5.malkotlin.model.shared.Picture
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimeSummary(
    val id: Int,
    val title: String,
    @SerialName("main_picture")
    val mainPicture: Picture?,
    @SerialName("alternative_titles")
    val alternativeTitles: AlternativeTitles?,
    @SerialName("start_date")
    val startDate: String?,
    @SerialName("end_date")
    val endDate: String?,
    val synopsis: String?,
    val mean: Float?,
    val rank: Int?,
    val popularity: Int?,
    @SerialName("num_list_users")
    val numListUsers: Int?,
    @SerialName("num_scoring_users")
    val numScoringUsers: Int?,
    val nsfw: NSFWCategory?,
    val genres: List<Genre>?,
    @SerialName("created_at")
    val createdAt: String?,
    @SerialName("updated_at")
    val updatedAt: String?,
    @SerialName("media_type")
    val mediaType: MediaType?,
    val status: AiringStatus?,
    @SerialName("my_list_status")
    val myListStatus: AnimeListStatus?,
    @SerialName("num_episodes")
    val numEpisodes: Int?,
    @SerialName("start_season")
    val startSeason: AiringSeason?,
    val broadcast: Broadcast?,
    val source: AnimeSource?,
    @SerialName("average_episode_duration")
    val averageEpisodeDuration: Int?,
    val rating: Rating?,
    val studios: List<Studio>?
)
