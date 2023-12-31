package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class BroadcastDay {
    @SerialName("monday")
    MONDAY,

    @SerialName("tuesday")
    TUESDAY,

    @SerialName("wednesday")
    WEDNESDAY,

    @SerialName("thursday")
    THURSDAY,

    @SerialName("friday")
    FRIDAY,

    @SerialName("saturday")
    SATURDAY,

    @SerialName("sunday")
    SUNDAY,

    @SerialName("other")
    OTHER
}
