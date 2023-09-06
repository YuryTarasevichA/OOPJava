package org.example.Lesson2;

public class Human {
    private Transport currentTransport;

    public void start(Transport transport) {
        if (currentTransport == null) {
            transport.run();
            currentTransport = transport;
        } else {
            System.out.println("уже передвигаемся");
        }
    }

    public void finish(Car car) {
        if (currentTransport != null) {
            car.stop();
            currentTransport = null;
        } else {
            System.out.println("уже стоим");
        }
    }
}
