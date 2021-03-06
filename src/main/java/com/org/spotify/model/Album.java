package com.org.spotify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * This is used for the spotify json data manipulation.
 * You need to give the Marshaller a class to store the data from Spotify.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Album {
    private List<Artist> artists;
    private String name;
    @JsonProperty("S")
    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
