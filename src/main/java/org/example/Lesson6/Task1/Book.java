package org.example.Lesson6.Task1;

public class Book {
    private String name;
    private String author;
    private BookGenere genre;


    public Book(String name, String author, BookGenere genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;

    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", genre=" + genre +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookGenere getGenre() {
        return genre;
    }

    public void setGenre(BookGenere genre) {
        this.genre = genre;
    }
}
