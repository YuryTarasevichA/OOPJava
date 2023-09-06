package org.example.HomeWork1;

import java.lang.reflect.Array;
import java.util.List;

public class Category {
    private String categoryName;
    private Product[] products;

    public Category(String categoryName, Product[] products) {
        this.categoryName = categoryName;
        this.products = products;
    }

    public String getName() {
        return categoryName;
    }

    public void setName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

}
