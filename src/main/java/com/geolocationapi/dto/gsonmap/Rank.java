package com.geolocationapi.dto.gsonmap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;


@Data
public class Rank {

    @SerializedName("importance")
    @Expose
    private double importance;
    @SerializedName("popularity")
    @Expose
    private double popularity;
    @SerializedName("confidence")
    @Expose
    private double confidence;
    @SerializedName("confidence_city_level")
    @Expose
    private long confidenceCityLevel;
    @SerializedName("confidence_street_level")
    @Expose
    private long confidenceStreetLevel;
    @SerializedName("match_type")
    @Expose
    private String matchType;

}
