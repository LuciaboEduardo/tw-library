package com.twu.biblioteca;

public class Biblioteca {
    private String[] books = {"Crepúsculo", "Lua Nova", "Eclipse", "Amanhecer"};
    private String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore";

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public String[] getBooks() {
        return books;
    }
}
