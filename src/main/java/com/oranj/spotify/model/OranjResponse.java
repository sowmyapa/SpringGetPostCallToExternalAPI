package com.oranj.spotify.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by sowmyaparameshwara on 3/28/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OranjResponse {
    @JsonProperty("Count")
    int count;

    @JsonProperty("Items")
    private List<Items> items;

    @JsonProperty("ScannedCount")
    private int scannedCount;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public int getScannedCount() {
        return scannedCount;
    }

    public void setScannedCount(int scannedCount) {
        this.scannedCount = scannedCount;
    }
}
