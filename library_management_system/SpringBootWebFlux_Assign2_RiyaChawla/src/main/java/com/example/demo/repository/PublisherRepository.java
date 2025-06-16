package com.example.demo.repository;

import com.example.demo.model.Publisher;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PublisherRepository extends MongoRepository<Publisher, String> {
}
