package org.example.ComplexCalc;

import org.example.ComplexCalc.Factory.CalcFactory;
import org.example.ComplexCalc.Factory.LogCalcFactory;

public class Main {
    public static void main(String[] args) {
        CalcFactory calcFactoryComplex = new LogCalcFactory(new ConsoleLogger());
        ViewComplex view = new ViewComplex(calcFactoryComplex);
        view.program();
    }
}
