package org.example.ComplexCalc.Factory;

import org.example.ComplexCalc.ComplexCalc;
import org.example.ComplexCalc.ComplexCalculate;

public interface CalcFactory {
    ComplexCalc create(double realPart, double imaginaryPart);
}
