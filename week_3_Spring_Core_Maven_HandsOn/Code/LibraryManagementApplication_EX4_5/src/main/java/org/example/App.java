package org.example;
import org.example.*;
import org.example.library.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load Spring IoC container from applicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the bookService bean and call method
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.displayBook();
    }
}
