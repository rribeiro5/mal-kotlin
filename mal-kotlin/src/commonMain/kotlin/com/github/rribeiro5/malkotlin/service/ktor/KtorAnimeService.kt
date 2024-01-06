package com.github.rribeiro5.malkotlin.service.ktor

import com.github.rribeiro5.malkotlin.api.AnimeAPI
import com.github.rribeiro5.malkotlin.model.anime.AnimeDetails
import com.github.rribeiro5.malkotlin.model.anime.AnimeListNode
import com.github.rribeiro5.malkotlin.model.anime.AnimeRankingNode
import com.github.rribeiro5.malkotlin.model.anime.AnimeRankingType
import com.github.rribeiro5.malkotlin.model.anime.Season
import com.github.rribeiro5.malkotlin.model.anime.SortParameter
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

    override suspend fun getAnimeDetails(
        animeId: Int,
        fields: String?
    ): Result<AnimeDetails> = runKtorRequestCatching {
        animeAPI.getAnimeDetails(
            animeId = animeId,
            fields = fields
        )
    }

    override suspend fun getAnimeRanking(
        rankingType: AnimeRankingType,
        limit: Int?,
        offset: Int?,
        fields: String?
    ): Result<PaginatedList<AnimeRankingNode>> = runKtorRequestCatching {
        animeAPI.getAnimeRanking(
            rankingType = rankingType.value,
            limit = limit,
            offset = offset,
            fields = fields
        )
    }

    override suspend fun getSeasonalAnime(
        year: Int,
        season: Season,
        sort: SortParameter?,
        limit: Int?,
        offset: Int?,
        fields: String?
    ): Result<PaginatedList<AnimeListNode>> = runKtorRequestCatching {
        animeAPI.getSeasonalAnime(
            year = year,
            season = season.value,
            sort = sort?.value,
            limit = limit,
            offset = offset,
            fields = fields
        )
    }

    override suspend fun getSuggestedAnime(
        limit: Int?,
        offset: Int?,
        fields: String?
    ): Result<PaginatedList<AnimeListNode>> = runKtorRequestCatching {
        animeAPI.getSuggestedAnime(
            limit = limit,
            offset = offset,
            fields = fields
        )
    }
}
