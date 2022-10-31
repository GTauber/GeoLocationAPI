package com.geolocationapi.dto.gsonmap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Query {

    @SerializedName("text")
    @Expose
    private String text;
//    @SerializedName("parsed")
//    @Expose
//    private Parsed parsed;

}
