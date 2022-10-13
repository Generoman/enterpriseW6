package com.rmm.w6.service

import com.rmm.w6.gateway.StuffGateway
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StuffService(@Autowired private val stuffGateway: StuffGateway) {

    /*
    fun getStuffById(id: Int): Stuff? {
        return stuffGateway ...osv
    }
     */
}