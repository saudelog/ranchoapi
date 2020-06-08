package com.saudel.ranchoapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RanchoapiApplication

fun main(args: Array<String>) {
	runApplication<RanchoapiApplication>(*args)
}