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
        books.add("Have a good day, Me");

    }

    public ArrayList<String> listBooks() {
        return books;
    }

    public void printBooksPretty() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }

}


//        System.out.format("%32s%10d%16s", string1, int1, string2);
