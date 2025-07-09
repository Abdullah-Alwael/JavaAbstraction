package com.abstraction;

public class Book extends Product {
    private String author;

    public Book(){

    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() { // the document says return double?
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
        return getPrice()/10;
    }
}
