package org.example.Lesson1;

public class Dog extends Animal {
    String name;

    @Override
    public void animalInfo() {
        System.out.println("Dog");
    }

    @Override
    public void voice() {
        System.out.println("Собака лает");
    }
}
