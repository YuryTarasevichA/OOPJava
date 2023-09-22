package org.example.HomeWork5.Complex;

public class ComplexDivision {
    public static ComplexNumber divide(ComplexNumber complex1, ComplexNumber complex2) {
        float denominator = complex2.getA() * complex2.getA() + complex2.getB() * complex2.getB();
        float realPart = (complex1.getA() * complex2.getA() + complex1.getB() * complex2.getB()) / denominator;
        float imaginaryPart = (complex1.getB() * complex2.getA() - complex1.getA() * complex2.getB()) / denominator;

        return new ComplexNumber(realPart, imaginaryPart);
    }
}
