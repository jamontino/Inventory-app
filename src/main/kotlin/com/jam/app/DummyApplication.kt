package com.jam.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DummyApp{
}

fun main(args: Array<String>) {
    runApplication<DummyApp>(*args)
}