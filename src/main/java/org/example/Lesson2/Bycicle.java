package org.example.Lesson2;

public class Bycicle implements Transport {
    @Override
    public void run() {
        System.out.println("вел едет");
    }

    @Override
    public void stop() {
        System.out.println("вел стоит");
    }
}
