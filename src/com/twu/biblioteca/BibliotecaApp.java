package com.twu.biblioteca;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BibliotecaApp {

    ArrayList<String> bookList;
    MainMenu menu;

    public BibliotecaApp(MainMenu menu) {
        bookList = new ArrayList<String>();
        this.menu = menu;
        bookList.add("first book");
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca! Please select an option from the menu");
        //present menu options and wait for users' selection,
        // menu in a loop untill quit
        //when user selects it, book listing should be printed now and have columns

    }

    public ArrayList<String> listBooks() {
        return bookList;
    }

    public String presentMenuOptionsUntilUserQuits(InputStream in) {
        Scanner sc = new Scanner(in);
        String userInput;
        String optionChosen;
        do {
            System.out.println("Enter an option in the list or 'quit'");
            userInput = getInput(sc);
            optionChosen = menu.selectOption(userInput);
        } while (!userInput.equals("quit"));

        return optionChosen;
    }

//    public String userInputGetter() {
//        return userInput;
//    }

    public String getInput(Scanner sc) {
        return sc.nextLine();
    }
}
