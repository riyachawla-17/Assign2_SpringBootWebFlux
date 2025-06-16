package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.model.Publisher;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.PublisherRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepo;
    
    @Autowired
    private PublisherRepository publisherRepo;


    @PostMapping
	public Book createBook(@RequestBody Book book) {
	    if (book.getPublisher() != null && book.getPublisher().getPublisherId() != null) {
	        Publisher fullPublisher = publisherRepo.findById(book.getPublisher().getPublisherId()).orElse(null);
	        book.setPublisher(fullPublisher);
	    }
	    return bookRepo.save(book);
	}


    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") String id) {
        return bookRepo.findById(id).orElse(null);
    }
}
