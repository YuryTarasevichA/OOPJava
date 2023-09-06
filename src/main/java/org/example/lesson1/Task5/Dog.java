package org.example.lesson1.Task5;

public class Dog extends Animal {
    public static int countDog;
    public static final int canRun = 500;
    public static final int  canSwim = 10;

    public Dog(String name) {
        super(name);
        countDog++;
    }

    @Override
    public void swim(int distance) {
        if (distance > canSwim){
            System.out.println(name + " Не проплыл ");
        }else System.out.println(name + " Проплыл " + distance + " метров");
    }

    @Override
    public void run(int distance) {
        if (distance > canRun){
            System.out.println(name + " Не пробежал ");
        }else System.out.println(name + " Пробежал " + distance + " метров");
    }
}
