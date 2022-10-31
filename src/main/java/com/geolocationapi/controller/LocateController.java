package com.geolocationapi.controller;

import com.geolocationapi.dto.gsonmap.Address;
import com.geolocationapi.model.Response;
import com.geolocationapi.service.impl.LocateAddressImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/locate")
public class LocateController {


    private final LocateAddressImpl locateAddressImpl;

    public LocateController(LocateAddressImpl locateAddressImpl) {
        this.locateAddressImpl = locateAddressImpl;
    }

    @GetMapping()
    public ResponseEntity<Response> getDistance(@RequestParam("addresses") List<String> addresses) throws InterruptedException {
    var addressList = new ArrayList<Address>();
    if (addresses.size() < 3) {
        return ResponseEntity.ok(
                Response.builder()
                        .timestamp(LocalDateTime.now())
                        .message("Please provide at least 3 addresses")
                        .status(HttpStatus.BAD_REQUEST)
                        .statusCode(HttpStatus.BAD_REQUEST.value())
                        .build());

    }

        for (String address : addresses) {
            addressList.add(locateAddressImpl.locateAddress(address));
        }

        return ResponseEntity.ok(
                Response.builder()
                        .timestamp(LocalDateTime.now())
                        .data(Map.of("Distance", addressList))
                        .message("Distance retrieved successfully")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build());
    }
}
