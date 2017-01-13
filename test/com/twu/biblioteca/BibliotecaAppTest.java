package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by tam on 13/01/2017.
 */
public class BibliotecaAppTest {

    BibliotecaApp app;

    @Before
    public void setUp() throws Exception {
        app = new BibliotecaApp();
    }

    @After
    public void tearDown() throws Exception {
        //note to self: look up what this does !!!!
    }

    @Test
    public void libraryBooksCanBeListed() throws Exception {
        ArrayList<String> bookList = new ArrayList<String>();
        bookList.add("a book");
        assertEquals(bookList, app.listBooks());
    }



}