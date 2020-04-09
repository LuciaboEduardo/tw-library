package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BibliotecaTest extends TestCase {
    Biblioteca biblioteca = new Biblioteca();

    @Test
    public void shouldReturnWelcomeMessage() {
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore";
        assertEquals(biblioteca.getWelcomeMessage(), welcomeMessage);
    }

    @Test
    public void shouldReturnAllBooks() {
        String[] mockBooks = {"Crepúsculo", "Lua Nova", "Eclipse", "Amanhecer"};
        assertEquals(biblioteca.getBooks(), mockBooks);
    }

}