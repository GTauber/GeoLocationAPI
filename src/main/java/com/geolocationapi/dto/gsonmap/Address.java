package com.geolocationapi.dto.gsonmap;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Address {

    @SerializedName("results")
    @Expose
    private List<Result> results = null;
//    @SerializedName("query")
//    @Expose
//    private Query query;

}
