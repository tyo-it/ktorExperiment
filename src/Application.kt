package com.ittyo

import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.DefaultHeaders
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    EngineMain.main(args)
}

fun Application.module() {
    install(DefaultHeaders)
}

