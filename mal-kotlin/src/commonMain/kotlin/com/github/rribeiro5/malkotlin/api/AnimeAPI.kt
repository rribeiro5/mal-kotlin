package com.github.rribeiro5.malkotlin.api

import com.github.rribeiro5.malkotlin.model.anime.AnimeDetails
import com.github.rribeiro5.malkotlin.model.anime.AnimeListNode
import com.github.rribeiro5.malkotlin.model.anime.AnimeRankingNode
import com.github.rribeiro5.malkotlin.model.core.PaginatedList
import com.github.rribeiro5.malkotlin.utils.appendQueryParameter
import com.github.rribeiro5.malkotlin.utils.fieldsParameter
import com.github.rribeiro5.malkotlin.utils.pagingParameters
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.appendPathSegments

private const val QUERY_PARAMETER = "q"
private const val RANKING_TYPE_PARAMETER = "ranking_type"
private const val SORT_PARAMETER = "sort"

internal class AnimeAPI(private val httpClient: HttpClient) {

    suspend fun getAnimeList(
        query: String?,
        limit: Int? = null,
        offset: Int? = null,
        fields: String? = null
    ): PaginatedList<AnimeListNode> =
        httpClient.get("v2/anime") {
            url {
                appendQueryParameter(QUERY_PARAMETER, query)
                pagingParameters(limit, offset)
                fieldsParameter(fields)
            }
        }.body()

    suspend fun getAnimeDetails(
        animeId: Int,
        fields: String? = null
    ): AnimeDetails =
        httpClient.get("v2/anime") {
            url {
                appendPathSegments(animeId.toString())
                fieldsParameter(fields)
            }
        }.body()

    suspend fun getAnimeRanking(
        rankingType: String,
        limit: Int? = null,
        offset: Int? = null,
        fields: String? = null
    ): PaginatedList<AnimeRankingNode> =
        httpClient.get("v2/anime/ranking") {
            url {
                appendQueryParameter(RANKING_TYPE_PARAMETER, rankingType)
                pagingParameters(limit, offset)
                fieldsParameter(fields)
            }
        }.body()

    suspend fun getSeasonalAnime(
        year: Int,
        season: String,
        sort: String? = null,
        limit: Int? = null,
        offset: Int? = null,
        fields: String? = null
    ): PaginatedList<AnimeListNode> =
        httpClient.get("v2/anime/season") {
            url {
                appendPathSegments(year.toString(), season)
                appendQueryParameter(SORT_PARAMETER, sort)
                pagingParameters(limit, offset)
                fieldsParameter(fields)
            }
        }.body()

    suspend fun getSuggestedAnime(
        limit: Int? = null,
        offset: Int? = null,
        fields: String? = null
    ): PaginatedList<AnimeListNode> =
        httpClient.get("v2/anime/suggestions") {
            url {
                pagingParameters(limit, offset)
                fieldsParameter(fields)
            }
        }.body()
}
