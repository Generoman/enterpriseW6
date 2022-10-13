package com.rmm.w6.controller

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class StuffController {

    @GetMapping("stuff/{id}")
    fun getStuffById() {
        // u kno wat 2 do
    }
}