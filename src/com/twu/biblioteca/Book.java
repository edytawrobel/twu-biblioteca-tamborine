package com.twu.biblioteca;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by tam on 12/01/2017.
 */
public class Book {

    private final String author;
    private final String datePublished;
    private final String title;
    private Boolean checkedOut;

    public Book(String author, String datePublished, String title){
        this.title = title;
        this.author = author;
        this.datePublished = datePublished;
        checkedOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public String getTitle() {
        return title;
    }

    public Boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        System.out.println("Thank you! Enjoy the book");
        checkedOut = true;
    }

    public void returnBook() {
        System.out.println("Thank you for returning the book.");
        checkedOut = false;
    }
}
