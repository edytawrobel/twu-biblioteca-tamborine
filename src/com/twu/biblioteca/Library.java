package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by tam on 16/01/2017.
 */
public class Library {

    ArrayList<Book> books;
    Book nineteenEightyFour;

    public Library() {
        books = new ArrayList<Book>();
        nineteenEightyFour = new Book("GeorgeOrwell", "1984", "nineteenEightyFour");
        books.add(nineteenEightyFour);

    }

    public ArrayList<Book> listBooks() {
        return books;
    }

    public void printBooksPretty() {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.format("%32s%32s%8s", book.getTitle(), book.getAuthor(), book.getDatePublished());
            //we can make this prettier for sure but it is boring - later
        }
    }

}


//        System.out.format(, string1, int1, string2);
