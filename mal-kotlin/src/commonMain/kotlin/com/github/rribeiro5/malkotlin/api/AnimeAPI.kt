package com.github.rribeiro5.malkotlin.api

import com.github.rribeiro5.malkotlin.model.anime.AnimeListNode
import com.github.rribeiro5.malkotlin.model.core.PaginatedList
import com.github.rribeiro5.malkotlin.utils.fieldsParameter
import com.github.rribeiro5.malkotlin.utils.pagingParameters
import com.github.rribeiro5.malkotlin.utils.queryParameterIfNotNull
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

private const val QUERY_PARAMETER = "q"

internal class AnimeAPI(private val httpClient: HttpClient) {

    suspend fun getAnimeList(
        query: String?,
        limit: Int? = null,
        offset: Int? = null,
        fields: String? = null
    ): PaginatedList<AnimeListNode> =
        httpClient.get("v2/anime") {
            url {
                queryParameterIfNotNull(QUERY_PARAMETER, query)
                pagingParameters(limit, offset)
                fieldsParameter(fields)
            }
        }.body()
}
