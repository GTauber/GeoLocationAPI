package com.geolocationapi.model;

import com.geolocationapi.dto.gsonmap.Address;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Distance {
    private Address addressA;
    private Address addressB;
    private double kmDistance;
}
