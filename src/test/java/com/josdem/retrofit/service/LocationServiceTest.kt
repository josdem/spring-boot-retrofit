package com.josdem.retrofit.service

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInfo
import org.junit.jupiter.api.assertNotNull
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import retrofit2.Retrofit

@SpringBootTest
internal class LocationServiceTest {

    @Autowired
    lateinit var locationService: LocationService

    private val log = LoggerFactory.getLogger(this::class.java)

    @Test
    fun `should load location service`(testInfo: TestInfo) {
        log.info(testInfo.displayName)
        val call = locationService.getLocation("token", 1L)
        val result = call.execute()
        assertTrue { result.toString().contains("https://vetlog-backend.josdem.io/geolocation/storeLocation/1") }
    }
}