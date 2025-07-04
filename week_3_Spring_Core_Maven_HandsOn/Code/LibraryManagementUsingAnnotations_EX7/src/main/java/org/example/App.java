package org.example;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.example.service.BookService;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean(BookService.class);
        bookService.displayBooks();

        context.close();
    }
}

