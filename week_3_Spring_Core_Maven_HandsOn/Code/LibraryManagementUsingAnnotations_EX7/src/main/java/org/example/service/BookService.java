package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.repository.BookRepository;

@Service  // Marks this class as a service bean
public class BookService {

    private BookRepository bookRepository;

    @Autowired  // Injects the BookRepository dependency
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        bookRepository.getAllBooks();
    }
}

