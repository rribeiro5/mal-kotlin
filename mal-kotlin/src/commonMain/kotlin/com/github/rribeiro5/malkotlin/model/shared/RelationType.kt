package com.github.rribeiro5.malkotlin.model.shared

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class RelationType {
    @SerialName("sequel")
    SEQUEL,
    @SerialName("prequel")
    PREQUEL,
    @SerialName("alternative_setting")
    ALTERNATIVE_SETTING,
    @SerialName("alternative_version")
    ALTERNATIVE_VERSION,
    @SerialName("side_story")
    SIDE_STORY,
    @SerialName("parent_story")
    PARENT_STORY,
    @SerialName("summary")
    SUMMARY,
    @SerialName("full_story")
    FULL_STORY
}
