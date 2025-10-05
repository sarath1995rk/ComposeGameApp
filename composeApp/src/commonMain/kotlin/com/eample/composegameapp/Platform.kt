package com.eample.composegameapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform