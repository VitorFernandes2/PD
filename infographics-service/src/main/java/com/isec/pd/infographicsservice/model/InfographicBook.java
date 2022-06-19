package com.isec.pd.infographicsservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
public class InfographicBook {
    private String name;
    private List<String> chapters;
}
