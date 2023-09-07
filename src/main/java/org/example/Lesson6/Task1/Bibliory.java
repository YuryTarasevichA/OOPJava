package org.example.Lesson6.Task1;

import java.util.List;

public class Bibliory implements Searcheble {
    private List<Book> books;

    public Bibliory(List<Book> books) {
        this.books = books;
    }

    /**
     * @return
     */
    @Override
    public Book findByAutor(String auter) {
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getAuter().equals(auter)){
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
