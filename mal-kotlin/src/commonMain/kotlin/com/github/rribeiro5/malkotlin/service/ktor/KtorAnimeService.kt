package com.github.rribeiro5.malkotlin.service.ktor

import com.github.rribeiro5.malkotlin.api.AnimeAPI
import com.github.rribeiro5.malkotlin.model.anime.AnimeListNode
import com.github.rribeiro5.malkotlin.model.core.PaginatedList
import com.github.rribeiro5.malkotlin.service.AnimeService
import com.github.rribeiro5.malkotlin.utils.runKtorRequestCatching

internal class KtorAnimeService(private val animeAPI: AnimeAPI) : AnimeService {

    override suspend fun getAnimeList(
        query: String?,
        limit: Int?,
        offset: Int?,
        fields: String?
    ): Result<PaginatedList<AnimeListNode>> = runKtorRequestCatching {
        animeAPI.getAnimeList(
            query = query,
            limit = limit,
            offset = offset,
            fields = fields
        )
    }
}
