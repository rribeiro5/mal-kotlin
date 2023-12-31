package com.github.rribeiro5.malkotlin.model.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class AnimeSource {
    @SerialName("original")
    ORIGINAL,
    @SerialName("manga")
    MANGA,
    @SerialName("4_koma_manga")
    MANGA_4_KOMA,
    @SerialName("web_manga")
    WEB_MANGA,
    @SerialName("digital_manga")
    DIGITAL_MANGA,
    @SerialName("novel")
    NOVEL,
    @SerialName("light_novel")
    LIGHT_NOVEL,
    @SerialName("visual_novel")
    VISUAL_NOVEL,
    @SerialName("game")
    GAME,
    @SerialName("card_game")
    CARD_GAME,
    @SerialName("book")
    BOOK,
    @SerialName("picture_book")
    PICTURE_BOOK,
    @SerialName("radio")
    RADIO,
    @SerialName("music")
    MUSIC,
    @SerialName("other")
    OTHER
}
