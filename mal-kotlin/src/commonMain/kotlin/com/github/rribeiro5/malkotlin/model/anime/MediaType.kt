package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class MediaType {
    @SerialName("unknown")
    UNKNOWN,

    @SerialName("tv")
    TV,

    @SerialName("ova")
    OVA,

    @SerialName("movie")
    MOVIE,

    @SerialName("special")
    SPECIAL,

    @SerialName("ona")
    ONA,

    @SerialName("music")
    MUSIC
}
