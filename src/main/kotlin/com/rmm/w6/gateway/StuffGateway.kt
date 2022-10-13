package com.rmm.w6.gateway

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import java.lang.RuntimeException

@Service
class StuffGateway {

    val logger = LoggerFactory.getLogger(StuffGateway::class.java)

    @Value("\${stuffservice.baseurl}")
    lateinit var baseUrl: String

    val GET_ENDPOINT = "/stuff/"

    val restClient = RestTemplate()

    @CircuitBreaker(name = "stuffGateway", fallbackMethod = "stuffFallback")
    fun getStuffById(id: Int): Stuff? {
        val result = restClient.getForObject("$baseUrl/$GET_ENDPOINT/$id", ByteArray::class.java)
        return jacksonObjectMapper().readValue(result, Stuff::class.java)
    }

    fun stuffFallback(t: Throwable): Stuff? {
        logger.error("Circuitbreaker tripped")
        throw RuntimeException("Stuff not found, service down")
    }
}

data class Stuff(val id: Int)
