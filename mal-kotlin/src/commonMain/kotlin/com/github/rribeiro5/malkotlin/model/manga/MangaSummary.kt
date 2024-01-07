package com.github.rribeiro5.malkotlin.model.manga

import com.github.rribeiro5.malkotlin.model.shared.Picture
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MangaSummary(
    val id: Int,
    val title: String,
    @SerialName("main_picture")
    val mainPicture: Picture?
    // To be completed
)
