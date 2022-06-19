package com.isec.pd.infographicsservice.model;

import lombok.Data;

import java.util.List;

@Data
public class InfographicCharacter {
    private String name;
    private String birth;
    private List<String> quotes;
}
