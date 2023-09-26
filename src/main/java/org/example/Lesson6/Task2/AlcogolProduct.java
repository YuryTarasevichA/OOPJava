package org.example.Lesson6.Task2;

public class AlcogolProduct extends Product {
    private int age;

    public AlcogolProduct(int price, String name, int qty, int age) {
        super(price, name, qty);
        this.age = age;
    }

    public boolean canBuy(int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }
}
