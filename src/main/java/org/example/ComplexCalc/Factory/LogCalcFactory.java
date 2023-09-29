package org.example.ComplexCalc.Factory;

import org.example.ComplexCalc.ComplexCalc;
import org.example.ComplexCalc.ComplexCalculate;
import org.example.ComplexCalc.LogComplex;
import org.example.ComplexCalc.Logable;

public class LogCalcFactory implements CalcFactory{
    private Logable logger;

    public LogCalcFactory(Logable logger) {
        this.logger = logger;
    }

    @Override
    public ComplexCalc create(double realPart, double imaginaryPart) {
        return new LogComplex(new ComplexCalculate(realPart, imaginaryPart),logger);
    }
}
