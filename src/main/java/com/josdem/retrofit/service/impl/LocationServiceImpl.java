package com.josdem.retrofit.service.impl;

import com.josdem.retrofit.model.LocationDto;
import com.josdem.retrofit.service.LocationService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.io.IOException;

@Slf4j
@Service
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService {

    private final Retrofit vetlogRetrofit;
    private LocationService locationService;

    @PostConstruct
    public void setup() {
        log.info("LocationService setup");
        locationService = vetlogRetrofit.create(LocationService.class);
    }

    @Override
    public Call<LocationDto> getLocation(String token, Long petId) throws IOException {
        return locationService.getLocation(token, petId);
    }
}
