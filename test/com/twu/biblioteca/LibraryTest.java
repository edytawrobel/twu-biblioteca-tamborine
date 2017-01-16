package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

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

}