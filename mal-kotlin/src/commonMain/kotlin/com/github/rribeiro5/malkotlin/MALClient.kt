package com.github.rribeiro5.malkotlin

import com.github.rribeiro5.malkotlin.di.MALContainer

class MALClient internal constructor(
    apiKey: String,
    timeoutMillis: Long?,
    container: MALContainer
) {

    constructor(
        apiKey: String,
        timeoutMillis: Long? = null
    ) : this(
        apiKey = apiKey,
        timeoutMillis = timeoutMillis,
        container = MALContainer(apiKey, timeoutMillis)
    )
}
