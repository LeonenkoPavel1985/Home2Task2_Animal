package org.example;

public class Tiger extends Animal {

    public Tiger(String name, double weight, int age) {
        super(name, weight, age);
        sound = "Rrrrrrr.";
        diet = "Meat.";
    }

    public String toString() {
        return super.toString();
    }
}
