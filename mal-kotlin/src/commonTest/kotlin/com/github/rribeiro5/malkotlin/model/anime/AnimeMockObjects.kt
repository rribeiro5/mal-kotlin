package com.github.rribeiro5.malkotlin.model.anime

import com.github.rribeiro5.malkotlin.model.core.PaginatedList
import com.github.rribeiro5.malkotlin.model.core.PagingData
import com.github.rribeiro5.malkotlin.model.shared.Picture
import com.github.rribeiro5.malkotlin.model.shared.RelationType

internal val getAnimeListMockObject = PaginatedList(
    data = listOf(
        AnimeListNode(
            node = AnimeSummary(
                id = 21,
                title = "One Piece",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/6/73245.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/6/73245l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            )
        ),
        AnimeListNode(
            node = AnimeSummary(
                id = 5040,
                title = "One Outs",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/13/22669.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/13/22669l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            )
        ),
        AnimeListNode(
            node = AnimeSummary(
                id = 459,
                title = "One Piece Movie 1",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/5/20925.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/5/20925l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            )
        )
    ),
    paging = PagingData(
        previous = null,
        next = "https://api.myanimelist.net/v2/anime?offset=4&q=one&limit=4"
    )
)

internal val getAnimeDetailsMockObject = AnimeDetails(
    id = 30230,
    title = "Diamond no Ace: Second Season",
    mainPicture = Picture(
        medium = "https://myanimelist.cdn-dena.com/images/anime/9/74398.jpg",
        large = "https://myanimelist.cdn-dena.com/images/anime/9/74398l.jpg"
    ),
    alternativeTitles = AlternativeTitles(
        synonyms = listOf(
            "Daiya no Ace: Second Season",
            "Ace of the Diamond: 2nd Season"
        ),
        en = "Ace of Diamond: Second Season",
        ja = "ダイヤのA[エース]～Second Season～"
    ),
    startDate = "2015-04-06",
    endDate = "2016-03-28",
    synopsis = "After the National Tournament, the Seidou High baseball team moves forward with uncertainty as the Fall season quickly approaches. In an attempt to build a stronger team centered around their new captain, fresh faces join the starting roster for the very first time. Previous losses weigh heavily on the minds of the veteran players as they continue their rigorous training, preparing for what will inevitably be their toughest season yet.\n \nRivals both new and old stand in their path as Seidou once again climbs their way toward the top, one game at a time. Needed now more than ever before, Furuya and Eijun must be determined to pitch with all their skill and strength in order to lead their team to victory. And this time, one of these young pitchers may finally claim that coveted title: \"The Ace of Seidou.\"\n\n[Written by MAL Rewrite]",
    mean = 8.42f,
    rank = 152,
    popularity = 1381,
    numListUsers = 57150,
    numScoringUsers = 29027,
    nsfw = NSFWCategory.WHITE,
    genres = listOf(
        Genre(id = 4, name = "Comedy"),
        Genre(id = 30, name = "Sports"),
        Genre(id = 23, name = "School"),
        Genre(id = 27, name = "Shounen")
    ),
    createdAt = "2015-03-02T06:03:11+00:00",
    updatedAt = "2018-04-25T09:14:14+00:00",
    mediaType = MediaType.TV,
    status = AiringStatus.FINISHED_AIRING,
    myListStatus = AnimeListStatus(
        status = AnimeWatchStatus.PLAN_TO_WATCH,
        score = 0,
        numEpisodesWatched = 0,
        isRewatching = false,
        startDate = null,
        finishDate = null,
        priority = null,
        numTimesRewatched = null,
        rewatchValue = null,
        tags = null,
        comments = null,
        updatedAt = "2017-11-11T19:51:22+00:00"
    ),
    numEpisodes = 51,
    startSeason = AiringSeason(year = 2015, season = Season.SPRING),
    broadcast = Broadcast(dayOfTheWeek = BroadcastDay.MONDAY, startTime = "18:00"),
    source = AnimeSource.MANGA,
    averageEpisodeDuration = 1440,
    rating = Rating.PG_13,
    studios = listOf(Studio(id = 10, name = "Production I.G"), Studio(id = 11, name = "Madhouse")),
    pictures = listOf(
        Picture(
            medium = "https://myanimelist.cdn-dena.com/images/anime/3/73625.jpg",
            large = "https://myanimelist.cdn-dena.com/images/anime/3/73625l.jpg"
        ),
        Picture(
            medium = "https://myanimelist.cdn-dena.com/images/anime/9/74398.jpg",
            large = "https://myanimelist.cdn-dena.com/images/anime/9/74398l.jpg"
        )
    ),
    background = "",
    relatedAnime = listOf(
        RelatedAnimeNode(
            node = AnimeSummary(
                id = 18689,
                title = "Diamond no Ace",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/5/54235.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/5/54235l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            ),
            relationType = RelationType.PREQUEL,
            relationTypeFormatted = "Prequel"
        ),
        RelatedAnimeNode(
            node = AnimeSummary(
                id = 34349,
                title = "Diamond no Ace: Second Season OVA",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/12/83218.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/12/83218l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            ),
            relationType = RelationType.SIDE_STORY,
            relationTypeFormatted = "Side story"
        )
    ),
    relatedManga = listOf(),
    recommendations = listOf(
        AnimeRecommendationNode(
            node = AnimeSummary(
                id = 28891,
                title = "Haikyuu!! Second Season",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/9/76662.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/9/76662l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            ),
            numRecommendations = 4
        ),
        AnimeRecommendationNode(
            node = AnimeSummary(
                id = 5941,
                title = "Cross Game",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/6/22103.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/6/22103l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            ),
            numRecommendations = 1
        ),
        AnimeRecommendationNode(
            node = AnimeSummary(
                id = 5040,
                title = "One Outs",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/13/22669.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/13/22669l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            ),
            numRecommendations = 1
        ),
        AnimeRecommendationNode(
            node = AnimeSummary(
                id = 32935,
                title = "Haikyuu!!: Karasuno Koukou VS Shiratorizawa Gakuen Koukou",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/7/81992.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/7/81992l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            ),
            numRecommendations = 1
        ),
        AnimeRecommendationNode(
            node = AnimeSummary(
                id = 32494,
                title = "Days (TV)",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/11/88507.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/11/88507l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            ),
            numRecommendations = 1
        ),
        AnimeRecommendationNode(
            node = AnimeSummary(
                id = 24415,
                title = "Kuroko no Basket 3rd Season",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/4/68299.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/4/68299l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            ),
            numRecommendations = 1
        ),
        AnimeRecommendationNode(
            node = AnimeSummary(
                id = 16894,
                title = "Kuroko no Basket 2nd Season",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/9/56155.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/9/56155l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            ),
            numRecommendations = 1
        ),
        AnimeRecommendationNode(
            node = AnimeSummary(
                id = 18179,
                title = "Yowamushi Pedal",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/5/53211.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/5/53211l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            ),
            numRecommendations = 1
        ),
        AnimeRecommendationNode(
            node = AnimeSummary(
                id = 20583,
                title = "Haikyuu!!",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/7/76014.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/7/76014l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            ),
            numRecommendations = 1
        )
    ),
    statistics = AnimeStatistics(
        numListUsers = 57194,
        status = AnimeStatusStatistics(
            watching = 7799,
            completed = 35492,
            onHold = 2802,
            dropped = 1242,
            planToWatch = 9859
        )
    )
)

internal val getAnimeRankingMockObject = PaginatedList(
    data = listOf(
        AnimeRankingNode(
            node = AnimeSummary(
                id = 5114,
                title = "Fullmetal Alchemist: Brotherhood",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/5/47421.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/5/47421l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            ),
            ranking = AnimeRankingInfo(rank = 1, previousRank = null)
        ),
        AnimeRankingNode(
            node = AnimeSummary(
                id = 32281,
                title = "Kimi no Na wa.",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/5/87048.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/5/87048l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            ),
            ranking = AnimeRankingInfo(rank = 2, previousRank = null)
        ),
        AnimeRankingNode(
            node = AnimeSummary(
                id = 30484,
                title = "Steins;Gate 0",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/1031/90444.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/1031/90444l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            ),
            ranking = AnimeRankingInfo(rank = 3, previousRank = null)
        ),
        AnimeRankingNode(
            node = AnimeSummary(
                id = 28977,
                title = "Gintama°",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/3/72078.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/3/72078l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            ),
            ranking = AnimeRankingInfo(rank = 4, previousRank = null)
        )
    ),
    paging = PagingData(
        previous = null,
        next = "https://api.myanimelist.net/v2/anime/ranking?offset=4&ranking_type=all&limit=4"
    )
)

internal val getSeasonalAnimeMockObject = PaginatedList(
    data = listOf(
        AnimeListNode(
            node = AnimeSummary(
                id = 35111,
                title = "Haikyuu!! Movie 4: Concept no Tatakai",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/3/86346.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/3/86346l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            )
        ),
        AnimeListNode(
            node = AnimeSummary(
                id = 35110,
                title = "Haikyuu!! Movie 3: Sainou to Sense",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/3/86069.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/3/86069l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            )
        ),
        AnimeListNode(
            node = AnimeSummary(
                id = 33486,
                title = "Boku no Hero Academia 2nd Season",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/12/85221.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/12/85221l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            )
        ),
        AnimeListNode(
            node = AnimeSummary(
                id = 34914,
                title = "New Game!!",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/4/86790.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/4/86790l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            )
        )
    ),
    paging = PagingData(
        previous = null,
        next = "https://api.myanimelist.net/v2/anime/season/2017/summer?offset=4&limit=4"
    )
)

internal val getSuggestedAnimeMockObject = PaginatedList(
    data = listOf(
        AnimeListNode(
            node = AnimeSummary(
                id = 36038,
                title = "Net-juu no Susume",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/3/87463.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/3/87463l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            )
        ),
        AnimeListNode(
            node = AnimeSummary(
                id = 34618,
                title = "Blend S",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/6/88286.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/6/88286l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            )
        ),
        AnimeListNode(
            node = AnimeSummary(
                id = 34933,
                title = "Kakegurui",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/3/86578.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/3/86578l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            )
        ),
        AnimeListNode(
            node = AnimeSummary(
                id = 34984,
                title = "Koi wa Ameagari no You ni",
                mainPicture = Picture(
                    medium = "https://myanimelist.cdn-dena.com/images/anime/1271/90136.jpg",
                    large = "https://myanimelist.cdn-dena.com/images/anime/1271/90136l.jpg"
                ),
                alternativeTitles = null,
                startDate = null,
                endDate = null,
                synopsis = null,
                mean = null,
                rank = null,
                popularity = null,
                numListUsers = null,
                numScoringUsers = null,
                nsfw = null,
                genres = null,
                createdAt = null,
                updatedAt = null,
                mediaType = null,
                status = null,
                myListStatus = null,
                numEpisodes = null,
                startSeason = null,
                broadcast = null,
                source = null,
                averageEpisodeDuration = null,
                rating = null,
                studios = null
            )
        )
    ),
    paging = PagingData(
        previous = null,
        next = "https://api.myanimelist.net/v2/anime/suggestions?offset=4&limit=4"
    )
)
