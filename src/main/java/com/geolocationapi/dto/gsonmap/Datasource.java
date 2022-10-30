package com.geolocationapi.dto.gsonmap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Datasource {

    @SerializedName("sourcename")
    @Expose
    private String sourcename;
    @SerializedName("attribution")
    @Expose
    private String attribution;
    @SerializedName("license")
    @Expose
    private String license;
    @SerializedName("url")
    @Expose
    private String url;

}
