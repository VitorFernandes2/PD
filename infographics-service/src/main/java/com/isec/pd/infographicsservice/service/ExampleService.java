package com.isec.pd.infographicsservice.service;

import com.isec.pd.infographicsservice.repository.entity.TestEntity;
import com.isec.pd.infographicsservice.repository.TestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final TestRepository repository;

    public ExampleService(TestRepository repository) {
        this.repository = repository;
    }

    public String example(String txt) {
        logger.info("Hello this is a register from the service!");
        repository.save(TestEntity.builder().txt(txt).build());
        return "Hello " + txt;
    }
}
