package com.isec.pd.infographicsservice.model;

import lombok.Data;

import java.util.List;

@Data
public class InfographicCharacter {
    private String name;
    private String height;
    private String race;
    private String gender;
    private String spouse;
    private String death;
    private String realm;
    private String hair;
    private String wikiUrl;
    private String birth;
    private List<String> quotes;
}
