package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by tam on 13/01/2017.
 */
public class BibliotecaAppTest {

    BibliotecaApp app;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Mock MainMenu menu;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        app = new BibliotecaApp(menu);
    }

    @After
    public void tearDown() throws Exception {
        //note to self: look up what this does !!!!
    }

    @Test
    public void libraryBooksCanBeListed() throws Exception {
        ArrayList<String> bookList = new ArrayList<String>();
        bookList.add("first book");
        assertEquals(bookList, app.listBooks());
    }

    @Test
    public void weCanGetUserInput() {
        InputStream in = new ByteArrayInputStream("some input".getBytes());
        assertEquals("some input", app.getInput(new Scanner(in)));
    }

    @Test
    public void noSuchElementExceptionIsThrownWhenUserDoesNotQuit() throws NoSuchElementException {
        InputStream in = new ByteArrayInputStream("some input".getBytes());
        exception.expect(NoSuchElementException.class); //line before line that will throw exception
        app.presentMenuOptionsUntilUserQuits(in); //should throw exception
    }

    @Test
    public void noExceptionIsThrownWhenUserQuits() {
        InputStream in = new ByteArrayInputStream("quit".getBytes());
        app.presentMenuOptionsUntilUserQuits(in);
    }

    @Test
    public void presentMethodCallsSelectOption() {
        InputStream in = new ByteArrayInputStream("List Books\nquit".getBytes());
        when(menu.optionIsValid(anyString())).thenReturn(true);

        app.presentMenuOptionsUntilUserQuits(in);
        //verify selectOption has been called with args:
        verify(menu).selectOption("List Books");
        verify(menu).selectOption("quit");
    }

    @Test
    public void warningIsShownWhenInvalidOptionChosen() throws RuntimeException {
        InputStream in = new ByteArrayInputStream("some invalid option".getBytes());
        assertEquals("invalid option try again",app.presentMenuOptionsUntilUserQuits(in));

    }



}



/// available in junit 4.13 version BUT it's unstable atm:
//    assertThrows(NoSuchElementException.class,
//                () -> app.presentMenuOptionsUntilUserQuits(in));
//}