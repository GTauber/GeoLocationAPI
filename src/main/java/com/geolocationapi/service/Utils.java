package com.geolocationapi.service;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static com.geolocationapi.service.impl.LocateAddressImpl.API_KEY;
import static com.geolocationapi.service.impl.LocateAddressImpl.API_URL;

public class Utils {

    private Utils() {}
    public static String buildUrl(String address) {
        String encodedAddress = URLEncoder.encode(address, StandardCharsets.UTF_8);
        return String.format(API_URL, encodedAddress, API_KEY);
    }
}
