package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "publishers")
public class Publisher {
    @Id
    private String publisherId;
    private String name;
    private String address;

    public Publisher() {}

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters and Setters
}