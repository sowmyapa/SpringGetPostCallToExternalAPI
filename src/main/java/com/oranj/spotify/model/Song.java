package com.oranj.spotify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by sowmyaparameshwara on 3/28/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Song {

    @JsonProperty("S")
    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
