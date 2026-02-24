package com.josdem.retrofit.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LocationDto {
    private double latitude;
    private double longitude;
}
