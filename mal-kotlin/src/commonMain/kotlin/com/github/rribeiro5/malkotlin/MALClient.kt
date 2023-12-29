package com.github.rribeiro5.malkotlin

import com.github.rribeiro5.malkotlin.di.MALContainer

class MALClient internal constructor(container: MALContainer) {

    constructor(
        apiKey: String,
        timeoutMillis: Long? = null
    ) : this(
        container = MALContainer(
            apiKey = apiKey,
            timeoutMillis = timeoutMillis
        )
    )
}
