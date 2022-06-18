package com.isec.pd.infographicsservice.controller;

import com.isec.pd.infographicsservice.model.Infographic;
import com.isec.pd.infographicsservice.service.InfographicService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/infographic")
public class WebCrawlerController {

    private final InfographicService service;

    public WebCrawlerController(InfographicService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Void> saveInfographic(@RequestBody Infographic infographic) {
        service.saveInfographic(infographic);
        return ResponseEntity.ok().build();
    }
}
