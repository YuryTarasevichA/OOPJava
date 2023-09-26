package org.example.Lesson1.Task5;

public class Tiger extends Cat {
    public static final int canTigerRun = 400;
    public static final int canTigerSwim = 100;
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void swim(int distance) {
        if (distance > canTigerSwim){
            System.out.println(name + " Не проплыл ");
        }else System.out.println(name + " Проплыл " + distance + " метров");
    }

    @Override
    public void run(int distance) {
        if (distance > canTigerRun){
            System.out.println(name + " Не пробежал ");
        }else System.out.println(name + " Пробежал " + distance + " метров");
    }
}
