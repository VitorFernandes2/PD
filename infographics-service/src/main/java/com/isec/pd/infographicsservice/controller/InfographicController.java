package com.isec.pd.infographicsservice.controller;

import com.isec.pd.infographicsservice.model.Infographic;
import com.isec.pd.infographicsservice.service.InfographicService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8082", maxAge = 3600) // Required to solve the error: "has been blocked by CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource"
@RequestMapping("/infographic")
public class InfographicController {

    private final InfographicService service;

    public InfographicController(InfographicService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Infographic>> getInfographics() {
        List<Infographic> infographics = service.getInfographics();
        return infographics != null
                ? ResponseEntity.ok(infographics) :
                ResponseEntity.internalServerError().build();
    }

    @PostMapping
    public ResponseEntity<Void> saveInfographic(@RequestBody Infographic infographic) {
        service.saveInfographic(infographic);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteInfographic(@RequestBody String id) {
        service.deleteInfographic(id);
        return ResponseEntity.ok().build();
    }
}
