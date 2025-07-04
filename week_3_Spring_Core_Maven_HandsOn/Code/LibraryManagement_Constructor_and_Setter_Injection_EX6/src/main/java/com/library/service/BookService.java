package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private String serviceName;
    private BookRepository bookRepository;

    // Constructor for constructor injection
    public BookService(String serviceName) {
        this.serviceName = serviceName;
    }

    // Setter for setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayServiceInfo() {
        System.out.println("Service Name: " + serviceName);
        System.out.println("Repository: " + (bookRepository != null ? "Injected" : "Not Injected"));
    }
}

