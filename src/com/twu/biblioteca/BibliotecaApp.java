package com.twu.biblioteca;

import sun.applet.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BibliotecaApp {

    private MainMenu menu;
    private Scanner sc;

    public BibliotecaApp() {
        sc = new Scanner(System.in);
        this.menu = new MainMenu(sc);
//        (menu == null) ? new MainMenu(sc) : menu
    }

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        System.out.println("Welcome to Biblioteca! Please select an option from the menu");
        System.out.println(app.menu);
        //        menu.showOptions();
        app.askUserToSelectOptionUntilQuits(System.in);
    }

    private MainMenu getMenu() {
        return menu;
    }

    public void askUserToSelectOptionUntilQuits(InputStream in) {
        Scanner sc = new Scanner(in);
        String userInput;
        do {
            printOut(System.out, "Enter an option in the list or 'quit'");
            userInput = getInput(sc);
            if (menu.optionIsValid(userInput) || userInput.equals("quit")) {
                menu.selectOption(userInput);
            } else {
                printOut(System.out, "invalid option try again");
                continue;
            }
        } while (!userInput.equals("quit"));
    }

    public void printOut(PrintStream out, String textToPrint) {
        out.println(textToPrint);
    }

    public String getInput(Scanner sc) {
        return sc.nextLine();
    }

}


