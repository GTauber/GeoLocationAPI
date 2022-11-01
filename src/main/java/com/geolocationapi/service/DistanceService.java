package com.geolocationapi.service;

import com.geolocationapi.dto.gsonmap.Address;
import com.geolocationapi.model.Distance;
import com.geolocationapi.model.LocationsResponse;

import java.util.Collection;


public interface DistanceService {
    LocationsResponse distanceProcessor(Collection<Address> addresses);
    Distance calculateDistance(Address address1, Address address2);
    Distance calculateMinorDistance(Collection<Distance> addresses);
    Distance calculateMajorDistance(Collection<Distance> addresses);
}
