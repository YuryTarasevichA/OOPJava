package org.example.HomeWork1;

public class Product {
    private String productName;
    private int price;
    private int rang;

    public Product(String productName, int price, int rang) {
        this.productName = productName;
        this.price = price;
        this.rang = rang;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRang() {
        return rang;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product {" +
                "price = " + price +
                ", productName ='" + productName + '\'' +
                ", rang =" + rang +
                '}';
    }
}
