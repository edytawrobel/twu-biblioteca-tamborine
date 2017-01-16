package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by tam on 16/01/2017.
 */
public class Library {

    ArrayList<String> books;

    public Library() {
        books = new ArrayList<String>();
        books.add("1984, George Orwell");
    }

    public ArrayList<String> listBooks() {
        return books;
    }
}
