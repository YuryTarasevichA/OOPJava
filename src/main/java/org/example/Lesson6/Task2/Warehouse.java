package org.example.Lesson6.Task2;

import java.util.ArrayList;
import java.util.List;

public class Warehouse implements WarehouseHelper {
    private List<Product> warehouse = new ArrayList<>();

    public Warehouse(List<Product> warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void addProduct(Product product) {
        warehouse.add(product);
    }

    @Override
    public void removeProduct(Product product) {
        warehouse.remove(product);
    }

    public boolean takeMyProduct(Product product, int amount) {
        for (Product product1 : warehouse) {
            if (product1.equals(product)){
                if (product1.getQty() >= amount){
                    product1.decreaseQuantity(amount);
                    return true;
                } else System.out.println("Нет на складе в нужном количестве ");
            }
        }
        return false;
    }
}
