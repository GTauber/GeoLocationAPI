package com.geolocationapi.service;

import com.geolocationapi.dto.gsonmap.Address;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public interface LocateAddress {
    public Address locateAddress(String address) throws IOException, InterruptedException;
    public List<Address> locateAddresses(Collection<String> addresses);
}
