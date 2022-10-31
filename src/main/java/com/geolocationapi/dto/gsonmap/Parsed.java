package com.geolocationapi.dto.gsonmap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Parsed {

    @SerializedName("housenumber")
    @Expose
    private String housenumber;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("postcode")
    @Expose
    private String postcode;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("expected_type")
    @Expose
    private String expectedType;

}
