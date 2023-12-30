package com.github.rribeiro5.malkotlin.api

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.darwin.Darwin

internal actual fun httpClientEngine(): HttpClientEngine = Darwin.create()
