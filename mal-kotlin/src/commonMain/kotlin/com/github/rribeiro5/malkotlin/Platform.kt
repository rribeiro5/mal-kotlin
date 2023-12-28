package com.github.rribeiro5.malkotlin

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
