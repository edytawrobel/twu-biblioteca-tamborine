package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tam on 12/01/2017.
 */
public class BookTest {
    @Test
    public void booksHaveAuthorAndYearPublished() throws Exception {
        assertEquals("George Orwell", new Book().getAuthor());
    }

}