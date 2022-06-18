package com.isec.pd.infographicsservice.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "infographic")
public class InfographicEntity {

    @Id
    private String id;
    @CreatedDate
    private Date createAt;

    // FIXME: to be completed
    private String name;
}
