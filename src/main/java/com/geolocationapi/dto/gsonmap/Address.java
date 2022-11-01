package com.geolocationapi.dto.gsonmap;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {

    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    @SerializedName("query")
    @Expose
    private Query query;

    public Address(Query query) {
        this.query = query;
    }

}
