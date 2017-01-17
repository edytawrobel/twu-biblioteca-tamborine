package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Scanner;

import static org.junit.Assert.*;


/**
 * Created by tam on 13/01/2017.
 */
public class MainMenuTest {
    //what does throws exception

    private MainMenu mainMenu;

    @Mock Scanner sc;

    @Before
    public void setup(){
       mainMenu = new MainMenu(sc);
    }

    @Test
    public void menuCanShowOptions() throws Exception {
        String mandatoryOption = "List Books";
        assertTrue(mainMenu.showOptions().contains(mandatoryOption));
    }

    @Test
    public void validMenuOptionCanBeSelected() throws Exception {
    }

    @Test
    public void menuOptionIsValid() {
        String someInvalidInput = "something horrible we do not want to break things";
        assertEquals(false,mainMenu.optionIsValid(someInvalidInput));
        String someValidInput = "List Books";
        assertEquals(true,mainMenu.optionIsValid(someValidInput));
    }

    @Test
    public void menuOptionsCanBeAdded() throws Exception {
        String newMenuOption = "Register To Library";
        assert(!mainMenu.showOptions().contains(newMenuOption));
        mainMenu.addOption(newMenuOption, getRegisterRunnable(sc));
        assert(mainMenu.showOptions().contains(newMenuOption));
    }

    //helper method for test above
    private Runnable getRegisterRunnable(Scanner sc) {
        return () -> {
            System.out.println("We can add code to get User registration details here");
        };
    }

}