package com.isec.pd.infographicsservice.model;

import lombok.Data;

@Data
public class InfographicMovie {
    private String name;
    private int runtimeInMinutes;
    private int budgetInMillions;
    private int boxOfficeRevenueInMillions;
    private int academyAwardNominations;
    private int academyAwardWins;
    private Double rottenTomatoesScore;
}
