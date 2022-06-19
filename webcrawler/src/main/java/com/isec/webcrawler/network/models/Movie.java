package com.isec.webcrawler.network.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Movie {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("runtimeInMinutes")
    private int runtimeInMinutes;
    @JsonProperty("budgetInMillions")
    private int budgetInMillions;
    @JsonProperty("boxOfficeRevenueInMillions")
    private int boxOfficeRevenueInMillions;
    @JsonProperty("academyAwardNominations")
    private int academyAwardNominations;
    @JsonProperty("academyAwardWins")
    private int academyAwardWins;
    @JsonProperty("rottenTomatoesScore")
    private Double rottenTomatoesScore;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    public void setRuntimeInMinutes(int runtimeInMinutes) {
        this.runtimeInMinutes = runtimeInMinutes;
    }

    public int getBudgetInMillions() {
        return budgetInMillions;
    }

    public void setBudgetInMillions(int budgetInMillions) {
        this.budgetInMillions = budgetInMillions;
    }

    public int getBoxOfficeRevenueInMillions() {
        return boxOfficeRevenueInMillions;
    }

    public void setBoxOfficeRevenueInMillions(int boxOfficeRevenueInMillions) {
        this.boxOfficeRevenueInMillions = boxOfficeRevenueInMillions;
    }

    public int getAcademyAwardNominations() {
        return academyAwardNominations;
    }

    public void setAcademyAwardNominations(int academyAwardNominations) {
        this.academyAwardNominations = academyAwardNominations;
    }

    public int getAcademyAwardWins() {
        return academyAwardWins;
    }

    public void setAcademyAwardWins(int academyAwardWins) {
        this.academyAwardWins = academyAwardWins;
    }

    public Double getRottenTomatoesScore() {
        return rottenTomatoesScore;
    }

    public void setRottenTomatoesScore(Double rottenTomatoesScore) {
        this.rottenTomatoesScore = rottenTomatoesScore;
    }

    @Override
    public String toString() {
        return "Movie {" +
                "id=" + id +
                ", name=" + name +
                ", runtimeInMinutes=" + runtimeInMinutes +
                ", budgetInMillions=" + budgetInMillions +
                ", boxOfficeRevenueInMillions=" + boxOfficeRevenueInMillions +
                ", academyAwardNominations=" + academyAwardNominations +
                ", academyAwardWins=" + academyAwardWins +
                ", rottenTomatoesScore=" + rottenTomatoesScore +
                "}";
    }
}
