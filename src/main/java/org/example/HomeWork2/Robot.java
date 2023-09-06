package org.example.HomeWork2;

public class Robot extends SuperAnimal {
    public static int countRobot;
    public static final int canRun = 10000;
    public static final int canJump = 10;

    public Robot(String name) {
        super(name);
        countRobot++;
    }

    /**
     * @param height
     */
    @Override
    public void jump(int height) {
        if(height > canJump) {
            System.out.println(name + " Не перепрыгнул");
        }else System.out.println(name + " перепрыгнул " + height + " метров");
    }

    /**
     * @param distance
     */
    @Override
    public void run(int distance) {
        if(distance > canRun) {
            System.out.println(name + " Не пробежал");
        }else System.out.println(name + " пробежал " + distance + " метров");
    }
}
