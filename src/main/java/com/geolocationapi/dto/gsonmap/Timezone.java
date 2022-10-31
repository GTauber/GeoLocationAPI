package com.geolocationapi.dto.gsonmap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Timezone {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("offset_STD")
    @Expose
    private String offsetSTD;
    @SerializedName("offset_STD_seconds")
    @Expose
    private long offsetSTDSeconds;
    @SerializedName("offset_DST")
    @Expose
    private String offsetDST;
    @SerializedName("offset_DST_seconds")
    @Expose
    private long offsetDSTSeconds;
    @SerializedName("abbreviation_STD")
    @Expose
    private String abbreviationSTD;
    @SerializedName("abbreviation_DST")
    @Expose
    private String abbreviationDST;

}
