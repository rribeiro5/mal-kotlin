package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class Rating {
    @SerialName("g")
    G,
    @SerialName("pg")
    PG,
    @SerialName("pg_13")
    PG_13,
    @SerialName("r")
    R,
    @SerialName("r+")
    R_PLUS,
    @SerialName("rx")
    RX
}
