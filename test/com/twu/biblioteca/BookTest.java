package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

public class BookTest extends TestCase {
    Book book = new Book("Crepúsculo", "Stephanie Meyer", 2007);

    @Test
    public void checkIfBookInfoIsCorrect() {
        String mockedBookInformation = "Crepúsculo | Stephanie Meyer | 2007";
        assertEquals(book.getInfo(), mockedBookInformation);
    }
}