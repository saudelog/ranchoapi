package com.saudel.ranchoapi

import com.expediagroup.graphql.spring.operations.Query
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class RanchoapiApplication

fun main(args: Array<String>) {
	runApplication<RanchoapiApplication>(*args)
}