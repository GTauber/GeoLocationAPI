package com.geolocationapi.controller;

import com.geolocationapi.model.Response;
import com.geolocationapi.service.impl.DistanceServiceImpl;
import com.geolocationapi.service.impl.LocateAddressServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/locate")
public class LocateController {


    private final LocateAddressServiceImpl locateAddressImpl;
    private final DistanceServiceImpl distanceServiceImpl;

    public LocateController(LocateAddressServiceImpl locateAddressImpl, DistanceServiceImpl distanceServiceImpl) {
        this.locateAddressImpl = locateAddressImpl;
        this.distanceServiceImpl = distanceServiceImpl;
    }

    @GetMapping()
    public ResponseEntity<Response> getDistance(@RequestParam("addresses") List<String> addresses) {
        if (addresses.size() < 3) {
            return ResponseEntity.ok(
                    Response.builder()
                            .timestamp(LocalDateTime.now())
                            .message("Please provide at least 3 addresses")
                            .status(HttpStatus.BAD_REQUEST)
                            .statusCode(HttpStatus.BAD_REQUEST.value())
                            .build());

        }

        var response = distanceServiceImpl.distanceProcessor(locateAddressImpl.locateAddresses(addresses));

        return ResponseEntity.ok(
                Response.builder()
                        .timestamp(LocalDateTime.now())
                        .data(Map.of("Distance", response))
                        .message("Distance retrieved successfully")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build());
    }
}
