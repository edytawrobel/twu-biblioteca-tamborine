package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tam on 16/01/2017.
 */
public class Library {

    List<Book> books;
    Book nineteenEightyFour;

    public Library() {
        books = new ArrayList<Book>();
        nineteenEightyFour = new Book("GeorgeOrwell", "1984", "nineteenEightyFour");
        books.add(nineteenEightyFour);
    }

    public List<Book> listBooks() {
        return filterBooks(books);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printBooksPretty() {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.format("%32s%32s%8s", book.getTitle(), book.getAuthor(), book.getDatePublished());
            //we can make this prettier for sure but it is boring - later
        }
    }

    private List<Book> filterBooks(List<Book> books) {
        return books.stream()
                .filter(bk -> !bk.isCheckedOut())
                .collect(Collectors.toList());
    }
}


//        System.out.format(, string1, int1, string2);
