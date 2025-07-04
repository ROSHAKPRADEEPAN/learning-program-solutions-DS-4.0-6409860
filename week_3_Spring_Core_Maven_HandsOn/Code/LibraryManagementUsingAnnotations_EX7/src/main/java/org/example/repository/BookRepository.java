package org.example.repository;

import org.springframework.stereotype.Repository;

@Repository  // Marks this class as a repository bean
public class BookRepository {

    public void getAllBooks() {
        System.out.println("Fetching all books from repository...");
    }
}
