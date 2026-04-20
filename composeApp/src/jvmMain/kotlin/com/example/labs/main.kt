package com.example.labs

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Labo1_cross_platform",
    ) {
        App()
    }
}