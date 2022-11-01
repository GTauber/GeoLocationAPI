package com.geolocationapi.service.impl;

import com.geolocationapi.dto.gsonmap.Address;
import com.geolocationapi.model.Distance;
import com.geolocationapi.model.LocationsResponse;
import com.geolocationapi.service.DistanceService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

@Service
public class DistanceServiceImpl implements DistanceService {

    public static final double EARTH_RADIUS = 6371;

    @Override
    public LocationsResponse distanceProcessor(Collection<Address> addresses) {
        List<Distance> distances = new ArrayList<>();
        addresses.forEach(address -> addresses.forEach(address2 -> {
            if (!address.equals(address2)) {
               distances.add(calculateDistance(address, address2));
            }
        }));
        return new LocationsResponse(distances, calculateMinorDistance(distances), calculateMajorDistance(distances));
    }

    @Override
    public Distance calculateDistance(Address address1, Address address2) {

        double lat1 = Math.toRadians(address1.getResults().get(0).getLat());
        double lon1 = Math.toRadians(address1.getResults().get(0).getLon());
        double lat2 = Math.toRadians(address2.getResults().get(0).getLat());
        double lon2 = Math.toRadians(address1.getResults().get(0).getLon());

        double dlat = lat2 - lat1;
        double dlon = lon2 - lon1;

        //Haversine formula
        double haversineRes = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2)
                * Math.pow(Math.sin(dlon / 2),2);

        double c = 2 * Math.asin(Math.sqrt(haversineRes));

        // calculate the result
        double result = (c * EARTH_RADIUS);

        return new Distance(address1, address2, result);
    }

    @Override
    public Distance calculateMinorDistance(Collection<Distance> distances) {
        var minorDistance = distances.stream().min(Comparator.comparing(Distance::getKmDistance));
        //return minor distance or else, null
        return minorDistance.orElse(null);

    }

    @Override
    public Distance calculateMajorDistance(Collection<Distance> distances) {
        var majorDistance = distances.stream().max(Comparator.comparing(Distance::getKmDistance));
        return majorDistance.orElse(null);
    }
}

