package org.example.lesson1.Task5;

public class HomeCat extends Cat{
    public static int countHomeCat;
    public HomeCat(String name) {
        super(name);
        countHomeCat++;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не плавают!!! ");
    }

    @Override
    public void run(int distance) {
        if(distance > canRun) {
            System.out.println(name + " Не пробежал");
        }else System.out.println(name + " пробежал " + distance + " метров");
    }
}
