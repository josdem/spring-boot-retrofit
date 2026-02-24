package com.josdem.retrofit.service

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertNotNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import retrofit2.Retrofit

@SpringBootTest
internal class LocationServiceTest {

    @Autowired
    lateinit var locationService: LocationService

    @Test
    fun `should load location service`() {
        assertNotNull(locationService)
    }
}