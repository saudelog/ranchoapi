package com.saudel.ranchoapi.query

import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class Rancho: Query {
    fun title() = "Rancho System"
}