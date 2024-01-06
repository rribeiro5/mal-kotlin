package com.github.rribeiro5.malkotlin

import com.github.rribeiro5.malkotlin.di.MALContainer
import com.github.rribeiro5.malkotlin.model.anime.AnimeDetails
import com.github.rribeiro5.malkotlin.model.anime.AnimeListNode
import com.github.rribeiro5.malkotlin.model.anime.AnimeRankingNode
import com.github.rribeiro5.malkotlin.model.anime.AnimeRankingType
import com.github.rribeiro5.malkotlin.model.anime.Season
import com.github.rribeiro5.malkotlin.model.anime.SortParameter
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

    suspend fun getAnimeDetails(
        animeId: Int,
        fields: String? = null
    ): Result<AnimeDetails> = animeService.getAnimeDetails(
        animeId = animeId,
        fields = fields
    )

    suspend fun getAnimeRanking(
        rankingType: AnimeRankingType,
        limit: Int? = null,
        offset: Int? = null,
        fields: String? = null
    ): Result<PaginatedList<AnimeRankingNode>> = animeService.getAnimeRanking(
        rankingType = rankingType,
        limit = limit,
        offset = offset,
        fields = fields
    )

    suspend fun getSeasonalAnime(
        year: Int,
        season: Season,
        sort: SortParameter? = null,
        limit: Int? = null,
        offset: Int? = null,
        fields: String? = null
    ): Result<PaginatedList<AnimeListNode>> = animeService.getSeasonalAnime(
        year = year,
        season = season,
        sort = sort,
        limit = limit,
        offset = offset,
        fields = fields
    )

    suspend fun getSuggestedAnime(
        limit: Int? = null,
        offset: Int? = null,
        fields: String? = null
    ): Result<PaginatedList<AnimeListNode>> = animeService.getSuggestedAnime(
        limit = limit,
        offset = offset,
        fields = fields
    )
}
