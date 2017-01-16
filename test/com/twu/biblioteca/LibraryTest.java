package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by tam on 16/01/2017.
 */
public class LibraryTest {

    Library library;

    @Mock
    Book book;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        library = new Library();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void hasListableBooks() {
        assertTrue(library.listBooks().contains("1984, George Orwell"));
    }

    @Test
    public void booksCanBePrintedInPrettyTable() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        library.printBooksPretty();
        String expectedOutput  = "1984, George Orwell\nHave a good day, Me\n";
        assertEquals(expectedOutput, outContent.toString());

    }

}