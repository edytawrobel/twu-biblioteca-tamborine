package com.twu.biblioteca;

import sun.applet.Main;

import java.util.ArrayList;

/**
 * Created by tam on 13/01/2017.
 */
public class MainMenu {

    private ArrayList<String> options;

    public MainMenu() {
        options = new ArrayList<String>();
    }

    public ArrayList<String> showOptions() {
        return options;
    }

    public void addOption(String newMenuOption) {
        options.add(newMenuOption);
    }

}
