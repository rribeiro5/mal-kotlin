package com.github.rribeiro5.malkotlin.service

import com.github.rribeiro5.malkotlin.model.anime.AnimeDetails
import com.github.rribeiro5.malkotlin.model.anime.AnimeListNode
import com.github.rribeiro5.malkotlin.model.anime.AnimeRankingNode
import com.github.rribeiro5.malkotlin.model.anime.AnimeRankingType
import com.github.rribeiro5.malkotlin.model.anime.Season
import com.github.rribeiro5.malkotlin.model.anime.SortParameter
import com.github.rribeiro5.malkotlin.model.core.PaginatedList

internal interface AnimeService {

    suspend fun getAnimeList(
        query: String?,
        limit: Int? = null,
        offset: Int? = null,
        fields: String? = null
    ): Result<PaginatedList<AnimeListNode>>

    suspend fun getAnimeDetails(
        animeId: Int,
        fields: String? = null
    ): Result<AnimeDetails>

    suspend fun getAnimeRanking(
        rankingType: AnimeRankingType,
        limit: Int? = null,
        offset: Int? = null,
        fields: String? = null
    ): Result<PaginatedList<AnimeRankingNode>>

    suspend fun getSeasonalAnime(
        year: Int,
        season: Season,
        sort: SortParameter? = null,
        limit: Int? = null,
        offset: Int? = null,
        fields: String? = null
    ): Result<PaginatedList<AnimeListNode>>

    suspend fun getSuggestedAnime(
        limit: Int? = null,
        offset: Int? = null,
        fields: String? = null
    ): Result<PaginatedList<AnimeListNode>>
}
