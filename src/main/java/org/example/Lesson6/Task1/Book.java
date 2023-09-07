package org.example.Lesson6.Task1;

public class Book {
    private String name;

    private String auter;
    private Book genre;


    public Book(String name, String auter, Book genre) {
        this.name = name;
        this.auter = auter;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "org.example.Lesson6.Task2.Book{" +
                "addres='" + auter + '\'' +
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

    public String getAuter() {
        return auter;
    }

    public void setAuter(String auter) {
        this.auter = auter;
    }

    public Book getGenre() {
        return genre;
    }

    public void setGenre(Book genre) {
        this.genre = genre;
    }
}
