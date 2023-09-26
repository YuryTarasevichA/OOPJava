package org.example.Lesson6.HomeWork6.Circle;

public class Program {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Restangle restangle = new Restangle(3, 4);
        System.out.println("Area: " + circle.takeArea());
        System.out.println("Perimeter: " + circle.takePerimetr());
        System.out.println("Diameter: " + circle.takeDiameter());
        System.out.println("Area: " + restangle.takeArea());
        System.out.println("Perimeter: " + restangle.takePerimetr());
        System.out.println("Corner: " + restangle.takeCorner());
    }
}
