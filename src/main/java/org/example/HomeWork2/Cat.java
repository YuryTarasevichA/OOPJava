package org.example.HomeWork2;

public class Cat extends Animal{
    public static int countCat;
    public static final int canRun = 200;
    public static final int canJump = 3;
    public Cat(String name) {
        super(name);
        countCat++;
    }
    @Override
    public void jump(int height) {
        if(height > canJump) {
            System.out.println(name + " Не перепрыгнул " + height + " метров");
        }else System.out.println(name + " перепрыгнул " + height + " метров");
    }
    @Override
    public void run(int distance) {
        if(distance > canRun) {
            System.out.println(name + " Не пробежал " + distance + " метров");
        }else System.out.println(name + " пробежал " + distance + " метров");

    }
}
