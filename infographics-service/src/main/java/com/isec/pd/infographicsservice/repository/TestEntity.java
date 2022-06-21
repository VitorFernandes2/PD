package com.isec.pd.infographicsservice.repository;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Document(collection = "test")
public class TestEntity {

    @Id
    private String id;
    private String txt;
}
