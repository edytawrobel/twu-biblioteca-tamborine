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

    public Boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        checkedOut = true;
    }

    public void returnBook() {
        checkedOut = false;
    }
}
