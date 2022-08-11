package org.example;

public class Crocodile extends Animal {

    public Crocodile(String name, double weight, int age) {
        super(name, weight, age);
        sound = "Grrrrrrrrr.";
        diet = "Meat.";
    }
    public String toString() {
        return super.toString();
    }
}
