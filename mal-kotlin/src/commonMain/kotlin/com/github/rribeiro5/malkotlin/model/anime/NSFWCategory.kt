package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class NSFWCategory {
    @SerialName("white")
    WHITE,

    @SerialName("gray")
    GRAY,

    @SerialName("black")
    BLACK
}
