package org.example.Lesson6.Task1;

import java.util.ArrayList;
import java.util.List;

public class Bibliory implements Searcheble {
    private List<Book> books = new ArrayList<>();
    public Bibliory(List<Book> books) {
        this.books = books;
    }

    @Override
    public Book findByAuthor(String author) {
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getAuthor().equals(author)){
                return books.get(i);
            }
        }
        return null;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
