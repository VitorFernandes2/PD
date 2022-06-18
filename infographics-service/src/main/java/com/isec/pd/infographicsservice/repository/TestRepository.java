package com.isec.pd.infographicsservice.repository;

import com.isec.pd.infographicsservice.repository.entity.TestEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends MongoRepository<TestEntity, String> {
}
