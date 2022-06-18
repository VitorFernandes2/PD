package com.isec.pd.infographicsservice.model;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

@Builder
@Jacksonized
public class Infographic {
    private String name;
}
