package com.isec.pd.infographicsservice.service;

import com.isec.pd.infographicsservice.model.Infographic;
import com.isec.pd.infographicsservice.repository.InfographicRepository;
import com.isec.pd.infographicsservice.repository.entity.InfographicEntity;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InfographicService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final InfographicRepository repository;
    private final ModelMapper modelMapper;

    @Autowired
    public InfographicService(InfographicRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    public void saveInfographic(Infographic infographic) {
        logger.info("New request from WebCrawler with the infographic: {}", infographic.toString());

        InfographicEntity entity = modelMapper.map(infographic, InfographicEntity.class);
//        entity.setCreateAt(new Date(System.currentTimeMillis()));

        repository.save(entity);
    }

    public List<Infographic> getInfographics() {
        return repository.findAll()
                .stream()
                .map(infographicEntity -> modelMapper.map(infographicEntity, Infographic.class))
                .collect(Collectors.toList());
    }

    public void deleteInfographic(String id) {
        repository.deleteById(id);
    }
}
