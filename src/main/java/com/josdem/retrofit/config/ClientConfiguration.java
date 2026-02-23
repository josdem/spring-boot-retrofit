package com.josdem.retrofit.config;

import okhttp3.OkHttpClient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
@RequiredArgsConstructor
public class ClientConfiguration {

    private final OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();

    @Bean
    public Retrofit vetlogRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://vetlog-backend.josdem.io/geolocation/")
                .client(okHttpClient.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
