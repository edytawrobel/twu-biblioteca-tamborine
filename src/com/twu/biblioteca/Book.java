package com.twu.biblioteca;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by tam on 12/01/2017.
 */
public class Book {

    String author;
    String datePublished;
    Boolean checkedOut;

    public Book(String initialAuthor, String initialDatePublished){
        author = initialAuthor;
        datePublished = initialDatePublished;
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
