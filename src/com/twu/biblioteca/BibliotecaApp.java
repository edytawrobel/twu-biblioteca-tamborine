package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {


    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca! Please select an option from the menu");
        //present menu options and wait for users' selection,
        // menu in a loop untill quit
        //when user selects it, book listing should be printed now and have columns

    }

    public ArrayList<String> listBooks() {
        ArrayList<String> bookList = new ArrayList<String>();
        bookList.add("a book");
        return bookList;
    }
}
