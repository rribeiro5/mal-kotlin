package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class Season(val value: String) {
    @SerialName("winter")
    WINTER("winter"),

    @SerialName("spring")
    SPRING("spring"),

    @SerialName("summer")
    SUMMER("summer"),

    @SerialName("fall")
    FALL("fall")
}
