package com.geolocationapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class LocationsResponse {
    List<Distance> distances;
    Distance minorDistance;
    Distance majorDistance;
}
