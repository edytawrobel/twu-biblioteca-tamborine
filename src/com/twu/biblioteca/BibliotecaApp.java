package com.twu.biblioteca;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    ArrayList<String> bookList;
    String userInput;

    public BibliotecaApp() {
        bookList = new ArrayList<String>();
        bookList.add("first book");
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca! Please select an option from the menu");
        //present menu options and wait for users' selection,
        // menu in a loop untill quit
        //when user selects it, book listing should be printed now and have columns

    }

    public ArrayList<String> listBooks() {
        bookList.add("a book");
        return bookList;
    }

    public String presentMenuOptionsUntilUserQuits() {
        MainMenu menu = new MainMenu();
        Scanner sc = new Scanner(System.in);
        //inject the above ?
        System.out.println("Enter an option in the list or 'quit'");
        String input = sc.nextLine();
        while (!input.equals("quit")) {
            userInput = menu.selectOption(input);
            input = sc.nextLine();
            System.out.println("Enter an option in the list or 'quit'");
        }
        return userInput;
    }

    public String userInputGetter() {
        return userInput;
    }

    public String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
