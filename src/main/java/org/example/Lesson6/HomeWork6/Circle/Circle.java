package org.example.Lesson6.HomeWork6.Circle;

public class Circle extends Geometric implements Area, Perimetr, Diameter {
    private double radius;

    @Override
    public double takeArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public double takePerimetr() {
        return 2 * Math.PI * radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * @return
     */
    @Override
    public double takeDiameter() {
        return 2 * radius;
    }
}
