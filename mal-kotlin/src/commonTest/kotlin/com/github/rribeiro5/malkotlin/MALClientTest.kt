package com.github.rribeiro5.malkotlin

import com.github.rribeiro5.malkotlin.exception.MALRequestException
import com.github.rribeiro5.malkotlin.model.anime.Season
import com.github.rribeiro5.malkotlin.model.anime.getAnimeDetailsMockObject
import com.github.rribeiro5.malkotlin.model.anime.getAnimeDetailsNotFoundErrorRequestMock
import com.github.rribeiro5.malkotlin.model.anime.getAnimeDetailsSuccessRequestMock
import com.github.rribeiro5.malkotlin.model.anime.getAnimeListMockObject
import com.github.rribeiro5.malkotlin.model.anime.getAnimeListServerErrorRequestMock
import com.github.rribeiro5.malkotlin.model.anime.getAnimeListSuccessRequestMock
import com.github.rribeiro5.malkotlin.model.anime.getAnimeRankingMockObject
import com.github.rribeiro5.malkotlin.model.anime.getAnimeRankingServerErrorRequestMock
import com.github.rribeiro5.malkotlin.model.anime.getAnimeRankingSuccessRequestMock
import com.github.rribeiro5.malkotlin.model.anime.getSeasonalAnimeMockObject
import com.github.rribeiro5.malkotlin.model.anime.getSeasonalAnimeServerErrorRequestMock
import com.github.rribeiro5.malkotlin.model.anime.getSeasonalAnimeSuccessRequestMock
import com.github.rribeiro5.malkotlin.model.anime.getSuggestedAnimeMockObject
import com.github.rribeiro5.malkotlin.model.anime.getSuggestedAnimeServerErrorRequestMock
import com.github.rribeiro5.malkotlin.model.anime.getSuggestedAnimeSuccessRequestMock
import com.github.rribeiro5.malkotlin.model.core.ErrorType
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MALClientTest {

    @Test
    fun testGetAnimeListSuccess() = runBlocking {
        val client = createClient(getAnimeListSuccessRequestMock)

        val result = client.getAnimeList(query = "one")

        assertTrue(result.isSuccess)
        assertEquals(getAnimeListMockObject, result.getOrNull())
    }

    @Test
    fun testGetAnimeListServerError() = runBlocking {
        val client = createClient(getAnimeListServerErrorRequestMock)

        val result = client.getAnimeList(query = "one")

        assertTrue(result.isFailure)
        assertEquals(ErrorType.SERVER_ERROR, (result.exceptionOrNull() as MALRequestException).errorType)
    }

    @Test
    fun testGetAnimeDetailsSuccess() = runBlocking {
        val client = createClient(getAnimeDetailsSuccessRequestMock)

        val result = client.getAnimeDetails(animeId = 30230)

        assertTrue(result.isSuccess)
        assertEquals(getAnimeDetailsMockObject, result.getOrNull())
    }

    @Test
    fun testGetAnimeDetailsNotFoundError() = runBlocking {
        val client = createClient(getAnimeDetailsNotFoundErrorRequestMock)

        val result = client.getAnimeDetails(animeId = 99999)

        assertTrue(result.isFailure)
        assertEquals(ErrorType.NOT_FOUND, (result.exceptionOrNull() as MALRequestException).errorType)
    }

    @Test
    fun testGetAnimeRankingSuccess() = runBlocking {
        val client = createClient(getAnimeRankingSuccessRequestMock)

        val result = client.getAnimeRanking()

        assertTrue(result.isSuccess)
        assertEquals(getAnimeRankingMockObject, result.getOrNull())
    }

    @Test
    fun testGetAnimeRankingServerError() = runBlocking {
        val client = createClient(getAnimeRankingServerErrorRequestMock)

        val result = client.getAnimeRanking()

        assertTrue(result.isFailure)
        assertEquals(ErrorType.SERVER_ERROR, (result.exceptionOrNull() as MALRequestException).errorType)
    }

    @Test
    fun testGetSeasonalAnimeSuccess() = runBlocking {
        val client = createClient(getSeasonalAnimeSuccessRequestMock)

        val result = client.getSeasonalAnime(
            year = 2017,
            season = Season.SUMMER
        )

        assertTrue(result.isSuccess)
        assertEquals(getSeasonalAnimeMockObject, result.getOrNull())
    }

    @Test
    fun testGetSeasonalAnimeServerError() = runBlocking {
        val client = createClient(getSeasonalAnimeServerErrorRequestMock)

        val result = client.getSeasonalAnime(
            year = 2017,
            season = Season.SUMMER
        )

        assertTrue(result.isFailure)
        assertEquals(ErrorType.SERVER_ERROR, (result.exceptionOrNull() as MALRequestException).errorType)
    }

    @Test
    fun testGetSuggestedAnimeSuccess() = runBlocking {
        val client = createClient(getSuggestedAnimeSuccessRequestMock)

        val result = client.getSuggestedAnime()

        assertTrue(result.isSuccess)
        assertEquals(getSuggestedAnimeMockObject, result.getOrNull())
    }

    @Test
    fun testGetSuggestedAnimeServerError() = runBlocking {
        val client = createClient(getSuggestedAnimeServerErrorRequestMock)

        val result = client.getSuggestedAnime()

        assertTrue(result.isFailure)
        assertEquals(ErrorType.SERVER_ERROR, (result.exceptionOrNull() as MALRequestException).errorType)
    }

    private fun createClient(requestMock: RequestMock): MALClient {
        val container = testContainer(requestMock)
        return MALClient(container)
    }
}
