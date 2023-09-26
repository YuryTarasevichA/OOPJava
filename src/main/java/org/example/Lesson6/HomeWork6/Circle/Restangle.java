package org.example.Lesson6.HomeWork6.Circle;

public class Restangle extends Geometric implements Area, Perimetr, Corner {
    private double sideA;
    private double sideB;

    public Restangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double takeArea() {
        return sideA * sideB;
    }

    @Override
    public double takePerimetr() {
        return (2 * sideA) + (2 * sideB);
    }

    @Override
    public double takeCorner() {
        return 90;
    }

}
