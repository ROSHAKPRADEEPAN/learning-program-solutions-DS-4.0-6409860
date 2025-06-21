package com.example.factoryPattern;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF document.");
    }
}
