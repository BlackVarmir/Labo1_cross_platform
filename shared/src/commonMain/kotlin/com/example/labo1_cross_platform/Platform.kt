package com.example.labo1_cross_platform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform