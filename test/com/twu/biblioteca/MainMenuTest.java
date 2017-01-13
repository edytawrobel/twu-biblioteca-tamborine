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
    public void makeNewMainMenuInstanceForEachTest(){
       mainMenu = new MainMenu();
    }

    @Test
    public void menuCanShowOptions() throws Exception {
        String[] options = {"List Books"};
        assertEquals(options, mainMenu.showOptions());
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

}