package com.github.rribeiro5.malkotlin

import com.github.rribeiro5.malkotlin.di.MALContainer
import com.github.rribeiro5.malkotlin.model.anime.AnimeListNode
import com.github.rribeiro5.malkotlin.model.core.PaginatedList
import com.github.rribeiro5.malkotlin.service.AnimeService

class MALClient internal constructor(container: MALContainer) {

    private val animeService: AnimeService = container.animeService

    constructor(
        apiKey: String,
        timeoutMillis: Long? = null
    ) : this(
        container = MALContainer(
            apiKey = apiKey,
            timeoutMillis = timeoutMillis
        )
    )

    suspend fun getAnimeList(
        query: String?,
        limit: Int?,
        offset: Int?,
        fields: String?
    ): Result<PaginatedList<AnimeListNode>> = animeService.getAnimeList(
        query = query,
        limit = limit,
        offset = offset,
        fields = fields
    )
}
