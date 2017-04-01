package com.oranj.spotify.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by sowmyaparameshwara on 3/28/17.
 */
public class PlayList {

    @JsonProperty("N")
    private String n;

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }
}
