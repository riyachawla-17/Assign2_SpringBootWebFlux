package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "members")
public class Member {
    @Id
    private String memberId;
    private String name;
    private String email;

    public Member() {}

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
}
