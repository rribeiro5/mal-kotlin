package com.github.rribeiro5.malkotlin

import com.github.rribeiro5.malkotlin.di.MALContainer

class MALClient internal constructor(
    apiKey: String,
    container: MALContainer
) {

    constructor(apiKey: String) : this(
        apiKey = apiKey,
        container = MALContainer(apiKey)
    )
}
