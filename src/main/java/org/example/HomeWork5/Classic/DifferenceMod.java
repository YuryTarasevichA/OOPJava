package org.example.HomeWork5.Classic;

public class DifferenceMod extends CalculMod{

    @Override
    public double result() {
        return x - y;
    }


    @Override
    public void setX(double value) {
        super.x = value;
    }

    @Override
    public void setY(double value) {
        super.y = value;
    }
}
