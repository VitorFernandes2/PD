package com.isec.webcrawler.network.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InfographicMostSuccessMovies {

    private String name;
    private Double ratio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    @Override
    public String toString() {
        return "InfographicMostSuccessMovies {" +
                "name=" + name +
                ", ratio=" + ratio +
                "}";
    }
}
