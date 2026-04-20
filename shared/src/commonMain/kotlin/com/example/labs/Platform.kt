package com.example.labs

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform