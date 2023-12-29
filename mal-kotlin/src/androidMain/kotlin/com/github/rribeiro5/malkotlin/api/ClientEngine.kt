package com.github.rribeiro5.malkotlin.api

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.okhttp.OkHttp

actual fun httpClientEngine(): HttpClientEngine = OkHttp.create()
