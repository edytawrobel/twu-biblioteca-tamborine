package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tam on 12/01/2017.
 */
public class BookTest {
    private Book book;

    @Before
    public void giveFollowingObjectsToEachTest(){
       book = new Book("George Orwell", "1949");
    }

    @Test
    public void canConstructBookWithAuthorAndDatePublished() throws Exception {
        assertEquals("George Orwell", book.getAuthor());
        assertEquals("1949", book.getDatePublished());
    }

    @Test
    public void canCheckoutBook() throws Exception {
        assertEquals(false, book.isCheckedOut());
        book.checkOut();
        assertEquals(true, book.isCheckedOut());
    }

    @Test
    public void canReturnBook() throws Exception {
        book.checkOut();
        assertEquals(true, book.isCheckedOut());
        book.returnBook();
        assertEquals(false, book.isCheckedOut());

    }

}
