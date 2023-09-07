package org.example.HomeWork1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product[] productsForCategory1 = new Product[3];
        productsForCategory1[0] = new Product("Телефон", 10000, 5);
        productsForCategory1[1] = new Product("Ноутбук", 50000, 4);
        productsForCategory1[2] = new Product("Планшет", 20000, 3);
        Product[] productsForCategory2 = new Product[2];
        productsForCategory2[0] = new Product("Подгузник", 2000, 5);
        productsForCategory2[1] = new Product("Пелёнка", 500, 5);
        Product[] productsForCategory3 = new Product[4];
        productsForCategory3[0] = new Product("Куртка", 15000, 4);
        productsForCategory3[1] = new Product("Джинсы", 5000, 4);
        productsForCategory3[2] = new Product("Рубашка", 3000, 5);
        productsForCategory3[3] = new Product("Юбка", 3000, 5);
        Product[] productsForCategory4 = new Product[2];
        productsForCategory4[0] = new Product("Туфли", 10000, 3);
        productsForCategory4[1] = new Product("Кроссовки", 9000, 4);
        Category[] categories = new Category[4];
        categories[0] = new Category("Электроника", productsForCategory1);
        categories[1] = new Category("Детские товары", productsForCategory2);
        categories[2] = new Category("Одежда", productsForCategory3);
        categories[3] = new Category("Обувь", productsForCategory4);

        for (int i = 0; i < categories.length; i++) {
            System.out.println("Категория: " + categories[i].getName());
            for (int j = 0; j < categories[i].getProducts().length; j++) {
                System.out.println(categories[i].getProducts()[j]);
            }
        }
        User[] users = new User[3];
        users [0] = new User ("Саша", "password1");
        users [1] = new User("Маша", "password2");
        users [2] = new User("Даша", "password3");
        users[0].getBasket().addProduct(productsForCategory2[0]);
        users[0].getBasket().addProduct(productsForCategory1[0]);
        users[0].getBasket().addProduct(productsForCategory1[0]);
        users[1].getBasket().addProduct(productsForCategory4[1]);
        users[2].getBasket().addProduct(productsForCategory2[1]);
        users[2].getBasket().addProduct(productsForCategory2[1]);


//        for (int i = 0; i < categories.length; i++) {
//            for (int j = 0; j < categories[i].getProducts().length; j++) {
//                Product product = categories[i].getProducts()[j];
//                for (int k = 0; k < users.length; k++) {
//                    if (users[k].getBasket().containsProductInBasket(product)){
//                        System.out.println("Вы уже добавили этот товар в корзину");
//                        users[k].getProducts().removeProduct(product);
//                    }
////                    users[k].getBasket().addProduct(product);
//                }
//            }
//        }
//        for (int i = 0; i < users.length; i++) {
//            Set<Product> productsInBasket = users[i].getBasket().getProductsInBasket();
//            Iterator<Product> iterator = productsInBasket.iterator();
//            while (iterator.hasNext()) {
//                Product product = iterator.next();
//                if (users[i].getBasket().getProductCount(product) == 1) {
//                    iterator.remove();
//                } else {
//                    users[i].getBasket().removeProduct(product);
//                }
//            }
//        }

        for (int i = 0; i < users.length; i++) {
            System.out.println("Покупки пользователя " + users[i].getUsername() + ":");
            for (int j = 0; j < users[i].getBasket().getProducts().length; j++) {
                System.out.println(users[i].getBasket().getProducts()[j].toString());
            }
        }
    }
}
