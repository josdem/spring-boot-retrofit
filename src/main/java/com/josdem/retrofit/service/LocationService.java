package com.josdem.retrofit.service;

import com.josdem.retrofit.model.LocationDto;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

import java.io.IOException;

public interface LocationService {
    @GET("storeLocation/{petId}")
    Call<LocationDto> getLocation(@Header("token") String token, @Path("petId") Long petId) throws IOException;
}
