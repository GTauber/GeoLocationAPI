package com.geolocationapi.service.impl;

import com.geolocationapi.dto.gsonmap.Address;
import com.geolocationapi.service.LocateAddress;
import com.geolocationapi.service.Utils;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Collection;
import java.util.Collections;

@Service
@Slf4j
public class LocateAddressImpl implements LocateAddress {
    private static final HttpClient httpClient = HttpClient.newHttpClient();
    public static final String API_KEY = "bdc0c195ade5443bb9528b0d4beff3cf";
    public static final String API_URL = "https://api.geoapify.com/v1/geocode/search?text=%s&format=json&apiKey=%s";

    @Override
    public Address locateAddress(String addressStr) throws InterruptedException {
        log.info("Locating address: {}", addressStr);
        var req = HttpRequest.newBuilder(URI.create(Utils.buildUrl(addressStr)))
                .header("accept", "application/json")
                .GET()
                .build();
        HttpResponse<String> res = null;
        try {
            res = httpClient.send(req, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            log.error("Error sending request: {}", e.getMessage());
            e.printStackTrace();
        }

        return new GsonBuilder().create().fromJson(res != null ?  res.body() : null, Address.class);
    }

    @Override
    public Collection<Address> locateAddresses(Collection<String> addresses) {
        return Collections.emptyList();
    }
}
