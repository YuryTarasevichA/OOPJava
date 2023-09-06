package org.example.HomeWork2;

public abstract class SuperAnimal{
    String name;
    public static int count;

    public SuperAnimal(String name) {
        this.name = name;
        count++;
    }
    public abstract void jump(int height); // высота прыжка
    public abstract void run(int distance); // дистанция бега
}
