package com.github.rribeiro5.malkotlin.model.manga

import com.github.rribeiro5.malkotlin.model.shared.RelationType
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RelatedMangaNode(
    val node: MangaSummary,
    @SerialName("relation_type")
    val relationType: RelationType,
    @SerialName("relation_type_formatted")
    val relationTypeFormatted: String?
)
