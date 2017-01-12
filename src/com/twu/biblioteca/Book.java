package com.twu.biblioteca;

/**
 * Created by tam on 12/01/2017.
 */
public class Book {

    String author;
    String datePublished;

    public Book(String initialAuthor, String initialDatePublished){
        author = initialAuthor;
        datePublished = initialDatePublished;
    }

    public String getAuthor() {
        return author;
    }

    public String getDatePublished() {
        return datePublished;
    }
}
