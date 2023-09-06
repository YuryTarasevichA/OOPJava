package org.example.lesson1;

public abstract class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public Animal() {
    }
    public abstract void animalInfo();

    public void voice() {
        System.out.println("Животное = " + name + " издало звук");
    }
    public void jump() {
        System.out.println("Животное = " + name + " подпрыгнуло");
    }

}
