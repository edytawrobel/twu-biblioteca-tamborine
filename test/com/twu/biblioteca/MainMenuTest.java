package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by tam on 13/01/2017.
 */
public class MainMenuTest {
    //what does throws exception

    private MainMenu mainMenu;

    @Before
    public void setup(){
       mainMenu = new MainMenu();
    }

    @Test
    public void menuCanShowOptions() throws Exception {
        String mandatoryOption = "List Books";
        assertTrue(mainMenu.showOptions().contains(mandatoryOption));
    }

    @Test
    public void menuOptionsCanBeAdded() throws Exception {
        String newMenuOption = "Register";
        assert(!mainMenu.showOptions().contains(newMenuOption));
        mainMenu.addOption(newMenuOption);
        assert(mainMenu.showOptions().contains(newMenuOption));
    }

    @Test
    public void menuOptionsInitedWithListBooks() throws Exception {
        assert(mainMenu.showOptions().contains("List Books"));
    }

    @Test
    public void menuOptionCanBeSelected() throws Exception {
        String someBookObjMock = "replace me with a new Option() mock";
        assertEquals(someBookObjMock, mainMenu.selectOption(someBookObjMock));
    }

    @Test
    public void menuOptionIsValid() {
        String someInvalidInput = "something horrible we do not want to break things";
        assertEquals(false,mainMenu.optionIsValid(someInvalidInput));
        String someValidInput = "List Books";
        assertEquals(true,mainMenu.optionIsValid(someValidInput));
    }

}