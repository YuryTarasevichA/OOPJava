package org.example.Lesson6.Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product milk = new Product(12,"Milk",4);
        Product bread = new Product(9,"Bread",3);
        Product vodka = new AlcogolProduct(20,"Vodka", 10, 8);
        Warehouse warehouse = new Warehouse(Arrays.asList(milk, bread, vodka));
        Order order = new Order(warehouse);
        order.processOrder(milk, 2);
        order.processOrder(milk, 5);
        order.processOrder(vodka, 9);
        order.processOrder(vodka, 1);

    }
}
