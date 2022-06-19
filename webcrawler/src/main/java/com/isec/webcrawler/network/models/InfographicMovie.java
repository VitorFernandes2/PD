package com.isec.webcrawler.network.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InfographicMovie {

    private String name;
    private int runtimeInMinutes;
    private int budgetInMillions;
    private int boxOfficeRevenueInMillions;
    private int academyAwardNominations;
    private int academyAwardWins;
    private Double rottenTomatoesScore;

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
        return "InfographicMovies {" +
                "name=" + name +
                ", runtimeInMinutes=" + runtimeInMinutes +
                ", budgetInMillions=" + budgetInMillions +
                ", boxOfficeRevenueInMillions=" + boxOfficeRevenueInMillions +
                ", academyAwardNominations=" + academyAwardNominations +
                ", academyAwardWins=" + academyAwardWins +
                ", rottenTomatoesScore=" + rottenTomatoesScore +
                "}";
    }
}
