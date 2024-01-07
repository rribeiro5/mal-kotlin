package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.Serializable

@Serializable
data class AnimeListNode(
    val node: AnimeSummary
)
