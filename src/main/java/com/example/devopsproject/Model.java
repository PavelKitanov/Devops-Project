package com.example.devopsproject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
public class Model implements Serializable {

    @Id
    private String id;

    private String name;
    private int quantity;
    private String category;

    public Model() {
    }

    public Model(String name, int quantity, String category) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }
}