package com.rmm.w6

import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.SpringBootTest

@WebMvcTest
@AutoConfigureMockMvc
@WireMockTest
class W6ApplicationTests {

    @BeforeAll
    fun doSetup() {
        //stubFor() <- Jason slet med å få denne til å funke
    }

    @Test
    fun contextLoads() {
    }

}
