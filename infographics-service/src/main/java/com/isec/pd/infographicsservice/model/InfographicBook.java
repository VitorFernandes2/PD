package com.isec.pd.infographicsservice.model;

import lombok.Data;

import java.util.List;

@Data
public class InfographicBook {
    private String name;
    private List<String> chapters;
}
