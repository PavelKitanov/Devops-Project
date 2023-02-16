package com.example.devopsproject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping
    private List<Model> listAll(){
        return this.service.getAll();
    }

    @PostMapping
    private ResponseEntity<Model> add(@RequestBody ModelDto modelDto){
        return this.service.add(modelDto)
                .map(model -> ResponseEntity.ok().body(model))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }
}
