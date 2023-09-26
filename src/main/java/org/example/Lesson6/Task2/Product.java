package org.example.Lesson6.Task2;

import java.util.Objects;

public class Product implements ProductHelper{
    private int price;
    private String name;

    public Product(int price, String name, int qty) {
        this.price = price;
        this.name = name;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && qty == product.qty && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, qty);
    }

    private int qty;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


    /**
     * @param amount
     */
    @Override
    public void decreaseQuantity(int amount) {
        this.qty = qty - amount;
    }

    /**
     * @param amount
     */
    @Override
    public void increaseQuantity(int amount) {
        this.qty = qty + amount;
    }
}
