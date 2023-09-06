package org.example.HomeWork1;

public class User {
    private String username;
    private String password;
    private Basket basket;

    @Override
    public String toString() {
        return "User{ " +
                "basket = " + basket +
                ", password ='" + password + '\'' +
                ", username ='" + username + '\'' +
                '}';
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.basket = new Basket();
    }

    public Basket getBasket() {
        return basket;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}
