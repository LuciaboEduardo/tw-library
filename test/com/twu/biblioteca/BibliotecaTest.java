package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaTest extends TestCase {
    Biblioteca biblioteca = new Biblioteca();

    @Test
    public void shouldReturnWelcomeMessage() {
        assertEquals(biblioteca.welcome(), "Welcome to the library!");
    }

}