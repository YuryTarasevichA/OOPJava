package org.example.Lesson1.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal[] animals = {
                new Dog(scanner.nextLine()),
                new HomeCat(scanner.nextLine()),
                new Tiger(scanner.nextLine())
        };

        System.out.println("Введите дистанцию бега: ");
        int runDistance = (Integer.parseInt(scanner.nextLine()));
        System.out.println("Введите дистанцию плавания: ");
        int swimDistance= Integer.parseInt(scanner.nextLine());
        for (Animal animal : animals) {
            animal.run(runDistance);
            animal.swim(swimDistance);
        }
    }
}
