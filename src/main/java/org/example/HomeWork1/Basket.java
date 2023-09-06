package org.example.HomeWork1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Basket {
    private Product[] products;

    public Basket() {
        this.products = new Product[0];
    }
    public void addProduct(Product product) {
        Product[] newProducts = new Product[products.length + 1];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        newProducts[products.length] = product;
        products = newProducts;
    }
    public void removeProduct(Product product) {
        int index = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(product)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            Product[] newProducts = new Product[products.length - 1];
            System.arraycopy(products, 0, newProducts, 0, index);
            System.arraycopy(products, index + 1, newProducts, index, products.length - index - 1);
            products = newProducts;
        }
    }
    public Product [] getProducts() {
        return products;
    }
    public boolean containsProductInBasket(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(product)) {
                return true;
            }
        }
        return false;
    }


    public List<Product> getProductList() {
        List<Product> productList = new ArrayList<>();
        for (Product product : products) {
            productList.add(product);
        }
        return productList;
    }
    
}
