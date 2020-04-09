package com.twu.biblioteca;

import java.util.Arrays;

public class BibliotecaApp {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        System.out.println(biblioteca.getWelcomeMessage());
        System.out.println(Arrays.toString(biblioteca.getBooks()));
    }
}
