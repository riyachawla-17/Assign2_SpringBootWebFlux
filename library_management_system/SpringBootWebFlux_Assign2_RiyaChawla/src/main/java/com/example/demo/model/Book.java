package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Book {
    @Id
    private String bookId;
    private String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book() {}

    public Book(String title, String author, double price, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }
}