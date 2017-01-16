package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
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

    //helper method, move me?:
    public boolean containsInstancesOfBook(List<Book> collection) {
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

    @Test
    public void checkedOutBooksDoNotAppearInLibraryBooksList() {
        when(book.isCheckedOut()).thenReturn(true);
        library.addBook(book);
        assertFalse(library.listBooks().contains(book));
    }

    @Test
    public void returnedBooksAppearInLibraryBooksList() {
        when(book.isCheckedOut()).thenReturn(false);
        library.addBook(book);
        assertTrue(library.listBooks().contains(book));
    }




}