package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by tam on 16/01/2017.
 */
public class LibraryTest {

    Library library;
    Book nineteenEightyFour;

    @Mock
    Book book;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        nineteenEightyFour = new Book("GeorgeOrwell", "1984", "nineteenEightyFour");

        library = new Library();
    }

    @After
    public void tearDown() throws Exception {

    }

    public boolean containsInstancesOfBook(ArrayList<Book> collection) {
        for(Book book : collection){
            if (book instanceof Book) return true;
        }
        return false;
    }

    @Test
    public void hasListableBooks() {
        assertTrue(containsInstancesOfBook(library.listBooks()));
    }

    @Test
    public void booksCanBePrintedInPrettyTable() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        library.printBooksPretty();
        String expectedOutputSubstr  = "nineteenEightyFour";
        assertTrue(outContent.toString().contains(expectedOutputSubstr));
    }

}