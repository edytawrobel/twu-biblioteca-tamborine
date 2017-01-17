package com.twu.biblioteca;

import sun.applet.Main;

import java.util.*;
import java.util.function.Predicate;

import static java.lang.System.*;

/**
 * Created by tam on 13/01/2017.
 */
public class MainMenu {

    private Map<String, Runnable> options;
    Library library;

    public MainMenu(Scanner sc) {
        library = new Library();
        options = new HashMap<>();
        options.put("List Books", getListBooksRunnable());
        options.put("Checkout Book", getCheckoutBookRunnable(sc));
        options.put("Return Book", getReturnBookRunnable(sc));
    }

    public void showOptions() {
        Set options = this.options.keySet();
        for (Object o : options) {
            System.out.println(o.toString());
        }

    }

    public void selectOption(String optionChosen) {
        options.get(optionChosen).run();
    }

    public boolean optionIsValid(String input) {
        return options.containsKey(input);
    }

    public String getInput(Scanner sc) {
        return sc.nextLine();
    }

    public void addOption(String key, Runnable value) {
        options.put(key, value);
    }

    private Runnable getReturnBookRunnable(Scanner sc) {
        return () -> {
            System.out.println("Type the name of the book you want to return: ");
            String name = getInput(sc);
            library.getBookByName(name).returnBook();
        };
    }

    private Runnable getCheckoutBookRunnable(Scanner sc) {
        return () -> {
            System.out.println("Type the name of the book you want to checkout: ");
            String name = getInput(sc);
            library.getBookByName(name).checkOut();
        };
    }

    private Runnable getListBooksRunnable() {
        return () -> library.printBooksPretty();
    }
}


