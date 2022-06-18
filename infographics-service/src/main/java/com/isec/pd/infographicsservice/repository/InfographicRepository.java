package com.isec.pd.infographicsservice.repository;

import com.isec.pd.infographicsservice.repository.entity.InfographicEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfographicRepository extends MongoRepository<InfographicEntity, String> {
}
