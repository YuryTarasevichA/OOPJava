package org.example.ComplexCalc;

import org.example.ComplexCalc.Logable;

public class ConsoleLogger implements Logable {

    @Override
    public void log(String message) {
        System.out.println("LOG :  " + message);
    }
}
