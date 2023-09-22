package org.example.HomeWork5.Complex;

public class ComplexNumber {
    private float a;
    private float b;
    private float newA;
    private float newB;
    ComplexNumber newComplex;
    public ComplexNumber(float _a, float _b){
        a = _a;
        b = _b;
    }
    public float getA(){
        return a;
    }
    public float getB(){
        return b;
    }

    public String toString(){
        return "(" + a + ") + (" + b + ")i";
    }
}
