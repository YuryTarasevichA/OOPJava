package org.example.Lesson3.Task2;

public enum Fruits {
    Apple("Яблоко"), Orange("Апельсин"), Lemon("Лемон"), Cherry("Вишня"), Peach("Персик");
    private String name;

    private Fruits(String name) {
        this.name = name;
    }

    Fruits() {
    }

    public String getName() {
        return name;
    }
}
