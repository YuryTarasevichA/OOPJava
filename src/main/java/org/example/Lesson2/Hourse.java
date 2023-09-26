package org.example.Lesson2;

import org.example.Lesson1.Animal;

public class Hourse extends Animal implements Transport {
    @Override
    public void run() {
        System.out.println("катаемся на лошади");
    }

    @Override
    public void stop() {
        System.out.println("лошадка остановилась");
    }

    @Override
    public void animalInfo() {
        System.out.println("это лошадь");
    }
}
