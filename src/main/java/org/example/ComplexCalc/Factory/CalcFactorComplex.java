package org.example.ComplexCalc.Factory;

import org.example.ComplexCalc.ComplexCalculate;

public class CalcFactorComplex implements CalcFactory{

    @Override
    public ComplexCalculate create(double realPart, double imaginaryPart) {
        return new ComplexCalculate(realPart, imaginaryPart);
    }

}
