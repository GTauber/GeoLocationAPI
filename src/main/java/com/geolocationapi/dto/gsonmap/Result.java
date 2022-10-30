package com.geolocationapi.dto.gsonmap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Result {

//    @SerializedName("datasource")
//    @Expose
//    private Datasource datasource;
//    @SerializedName("housenumber")
//    @Expose
//    private String housenumber;
//    @SerializedName("street")
//    @Expose
//    private String street;
//    @SerializedName("suburb")
//    @Expose
//    private String suburb;
//    @SerializedName("city")
//    @Expose
//    private String city;
//    @SerializedName("county")
//    @Expose
//    private String county;
//    @SerializedName("state")
//    @Expose
//    private String state;
//    @SerializedName("postcode")
//    @Expose
//    private String postcode;
//    @SerializedName("country")
//    @Expose
//    private String country;
//    @SerializedName("country_code")
//    @Expose
//    private String countryCode;
    @SerializedName("lon")
    @Expose
    private double lon;
    @SerializedName("lat")
    @Expose
    private double lat;
    @SerializedName("formatted")
    @Expose
    private String formatted;
//    @SerializedName("address_line1")
//    @Expose
//    private String addressLine1;
//    @SerializedName("address_line2")
//    @Expose
//    private String addressLine2;
//    @SerializedName("state_code")
//    @Expose
//    private String stateCode;
//    @SerializedName("result_type")
//    @Expose
//    private String resultType;
    @SerializedName("rank")
    @Expose
    private Rank rank;
//    @SerializedName("timezone")
//    @Expose
//    private Timezone timezone;
//    @SerializedName("place_id")
//    @Expose
//    private String placeId;



}
