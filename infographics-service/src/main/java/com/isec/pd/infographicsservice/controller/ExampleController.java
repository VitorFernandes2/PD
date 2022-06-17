package com.isec.pd.infographicsservice.controller;

import com.isec.pd.infographicsservice.service.ExampleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/example")
public class ExampleController {

    private final ExampleService service;

    public ExampleController(ExampleService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody final String test) {
        return ResponseEntity.ok(service.example(test));
    }
}
