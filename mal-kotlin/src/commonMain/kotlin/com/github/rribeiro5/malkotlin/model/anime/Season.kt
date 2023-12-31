package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class Season {
    @SerialName("winter")
    WINTER,
    @SerialName("spring")
    SPRING,
    @SerialName("summer")
    SUMMER,
    @SerialName("fall")
    FALL
}
