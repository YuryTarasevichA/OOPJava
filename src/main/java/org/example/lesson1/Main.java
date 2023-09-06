package org.example.lesson1;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "чёрный", 13);
//        cat1.name = "Барсик";
//        cat1.color = "чёрный";
//        cat1.age = 13;
//        cat1.setAge(10);
        System.out.println("cat1: " + cat1);

        Vector vector1 = new Vector(1, 0, 1);
        Vector vector2 = new Vector(2, 1, 3);
        System.out.println("Длинна вектора = " + vector1.length());
        System.out.println("Скалярное произведение векторов = " + vector1.scal(vector2));

        System.out.println("Векторное произведение двух векторов = " + vector1.vprod(vector2).toString());
//        Animal animal = new Animal() {
//            @Override
//            public void animalInfo() {
//
//            }
//        }
//        animal.animalInfo();
//        animal.voice();
//        animal.jump();
//        cat1.animalInfo();
        Animal animal = new Cat();
//        ((Cat) animal).svernutsya();
        ArrayList<Animal> animals = new ArrayList<>(Arrays.
                asList(new Cat(), new Dog()));
        for (Animal animal1 : animals) {
//            animal.animalInfo();
            animal1.voice();
            if (animal1 instanceof Cat) {
                ((Cat) animal1).svernutsya();
            }
        }
    }

}