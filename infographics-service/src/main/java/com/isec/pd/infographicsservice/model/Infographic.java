package com.isec.pd.infographicsservice.model;

import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Jacksonized
public class Infographic {
    private Date createdAt;
    private int numberBooks;
    private int numberMovies;
    private int numberCharacters;
    private int numberQuotes;
    private List<InfographicBook> books;
    private List<InfographicMovie> movies;
    private Map<String, List<InfographicCharacter>> characters;
    private List<InfographicMostTalkativeCharacters> mostTalkativeCharacters;
    private List<InfographicMostSuccessMovies> mostSuccessMovies;
}
