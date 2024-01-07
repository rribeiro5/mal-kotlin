package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.Serializable

@Serializable
data class AlternativeTitles(
    val synonyms: List<String>?,
    val en: String?,
    val ja: String?
)
