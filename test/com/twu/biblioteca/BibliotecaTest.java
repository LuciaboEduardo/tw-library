package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BibliotecaTest {
    Biblioteca biblioteca = new Biblioteca();

    @Test
    public void shouldReturnWelcomeMessage() {
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore";
        assertEquals(biblioteca.getWelcomeMessage(), welcomeMessage);
    }

    @Test
    public void shouldReturnAllBooks() {
        String[] mockBooks = {
            "Crepúsculo | Stephanie Meyer | 2007", "Lua Nova | Stephanie Meyer | 2008", "Eclipse | Stephanie Meyer | 2009", "Amanhecer | Stephanie Meyer | 2010"
        };
        assertArrayEquals(biblioteca.getBooks(), mockBooks);
    }

}