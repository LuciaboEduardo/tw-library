package com.twu.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Book> books = new ArrayList<Book>();
    private String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore";

    public Biblioteca() {
        books.add(new Book("Crepúsculo", "Stephanie Meyer",  2007));
        books.add(new Book("Lua Nova", "Stephanie Meyer",  2008));
        books.add(new Book("Eclipse", "Stephanie Meyer",  2009));
        books.add(new Book("Amanhecer", "Stephanie Meyer",  2010));
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public String[] getBooks() {
        String[] booksInfos = books.stream().map(book -> book.getInfo()).toArray(String[]::new);
        return booksInfos;
    }
}
