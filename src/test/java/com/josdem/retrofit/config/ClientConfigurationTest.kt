package com.josdem.retrofit.config

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertNotNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import retrofit2.Retrofit

@SpringBootTest
internal class ClientConfigurationTest {

    @Autowired
    lateinit var vetlogRetrofit: Retrofit

    @Test
    fun `should load retrofit`() {
        assertNotNull(vetlogRetrofit)
    }
}