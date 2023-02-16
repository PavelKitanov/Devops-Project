package com.example.devopsproject;

import java.util.List;
import java.util.Optional;

public interface Service {
    List<Model> getAll();
    Optional<Model> add(ModelDto modelDto);
}
