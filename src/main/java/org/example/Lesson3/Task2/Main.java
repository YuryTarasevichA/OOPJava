package org.example.Lesson3.Task2;


public class Main {
    public static void main(String[] args) {
        Fruits fruits1 = Fruits.Peach;
        Fruits fruits2 = Fruits.Apple;
        Fruits fruits3 = Fruits.Lemon;
        Fruits fruits4 = Fruits.Cherry;
        Fruits fruits5 = Fruits.Orange;

        switch (fruits1) {
            case Peach -> System.out.println("Peach = " + fruits2.getName());
        }switch (fruits2) {
            case Apple -> System.out.println("Apple = " + fruits1.getName());
        }switch (fruits3) {
            case Lemon -> System.out.println("Lemon = " + fruits3.getName());
        }switch (fruits4) {
            case Cherry -> System.out.println("Cherry = " + fruits4.getName());
        }switch (fruits5) {
            case Orange -> System.out.println("Orange = " + fruits5.getName());

            default -> System.out.println("default");
        }

    }
}
