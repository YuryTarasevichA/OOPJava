package org.example.Lesson5;

import java.util.LinkedList;

public class Outer {
    public Outer() {
    }

    static class Inner {
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }


        public void innerValueMethod() {
            System.out.println(innerValue);
//            System.out.println(outerValue);
        }
    }
    int outerValue;
    public Outer(int outerValue) {
        this.outerValue = outerValue;
    }

    public void outerValueMethod(){
        System.out.println(outerValue);
//        System.out.println(innerValue);
//        outerValueMethod();
//        innerValueMethod();
    }

    public static void main(String[] args) {
        Inner inner = new Inner(10);
        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Полетели");
            }
        };
        flyable.fly();
        System.out.println(flyable.getClass().getName()); // org.example.Lesson5.Outer$1 вывод анонимного класса, если
//                                                           создать второй класс то будет org.example.Lesson5.Outer$2
        // outer implements Flyable
        // Outer$1 flyable = new Outer();
//        String s = "sdcijskcj";
//        System.out.println(s.getClass().getName());
//        class Cell {
//            int x;
//
//            public Cell(int x) {
//                this.x = x;
//            }
//
//            @Override
//            public String toString() {
//                return "$classname{" +
//                        "x=" + x +
//                        '}';
//            }
//        }
//        Cell cell = new Cell(4); // создания нового класса внутри метода (локальный класс)
    }

}
