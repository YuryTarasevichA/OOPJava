package org.example.HomeWork2;

public abstract class Animal extends SuperAnimal{

    public Animal(String name) {
        super(name);
    }
    @Override
    public abstract void jump(int height);
    @Override
    public abstract void run(int distance);
}
