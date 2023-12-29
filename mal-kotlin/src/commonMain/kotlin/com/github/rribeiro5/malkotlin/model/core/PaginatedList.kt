package com.github.rribeiro5.malkotlin.model.core

import kotlinx.serialization.Serializable

@Serializable
data class PaginatedList<T>(
    val data: List<T>,
    val paging: PagingData
)
