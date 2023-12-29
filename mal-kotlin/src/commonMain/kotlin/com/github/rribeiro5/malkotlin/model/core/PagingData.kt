package com.github.rribeiro5.malkotlin.model.core

import kotlinx.serialization.Serializable

@Serializable
data class PagingData(
    val previous: String?,
    val next: String?
)
