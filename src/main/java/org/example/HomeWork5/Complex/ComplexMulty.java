package org.example.HomeWork5.Complex;

public class ComplexMulty {
    public static ComplexNumber multiply(ComplexNumber complex1, ComplexNumber complex2) {
        float realPart = complex1.getA() * complex2.getA() - complex1.getB() * complex2.getB();
        float imaginaryPart = complex1.getA() * complex2.getB() + complex1.getB() * complex2.getA();

        return new ComplexNumber(realPart, imaginaryPart);
    }
}
