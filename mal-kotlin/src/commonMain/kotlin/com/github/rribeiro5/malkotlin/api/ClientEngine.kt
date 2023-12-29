package com.github.rribeiro5.malkotlin.api

import io.ktor.client.engine.HttpClientEngine

expect fun httpClientEngine(): HttpClientEngine
