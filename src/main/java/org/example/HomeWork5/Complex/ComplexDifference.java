package org.example.HomeWork5.Complex;

public class ComplexDifference {
    public static ComplexNumber subtract(ComplexNumber complex1, ComplexNumber complex2) {
        float realPart = complex1.getA() - complex2.getA();
        float imaginaryPart = complex1.getB() - complex2.getB();

        return new ComplexNumber(realPart, imaginaryPart);
    }
}

