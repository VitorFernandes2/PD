package com.isec.pd.infographicsservice.repository.entity;

import com.isec.pd.infographicsservice.model.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Document(collection = "infographic")
public class InfographicEntity {

    @Id
    private String id;
    @CreatedDate
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
