package com.github.rribeiro5.malkotlin.service

import com.github.rribeiro5.malkotlin.model.anime.AnimeListNode
import com.github.rribeiro5.malkotlin.model.core.PaginatedList

internal interface AnimeService {

    suspend fun getAnimeList(
        query: String?,
        limit: Int? = null,
        offset: Int? = null,
        fields: String? = null
    ): Result<PaginatedList<AnimeListNode>>
}
