package com.example.devopsproject;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    private final Repository repository;

    public ServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public List<Model> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Model> add(ModelDto modelDto) {
        return Optional.of(this.repository.save(new Model(modelDto.getName(),modelDto.getQuantity(), modelDto.getCategory())));
    }
}
