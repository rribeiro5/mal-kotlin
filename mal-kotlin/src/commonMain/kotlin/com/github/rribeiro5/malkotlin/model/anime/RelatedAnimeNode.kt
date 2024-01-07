package com.github.rribeiro5.malkotlin.model.anime

import com.github.rribeiro5.malkotlin.model.shared.RelationType
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RelatedAnimeNode(
    val node: AnimeSummary,
    @SerialName("relation_type")
    val relationType: RelationType,
    @SerialName("relation_type_formatted")
    val relationTypeFormatted: String?
)
