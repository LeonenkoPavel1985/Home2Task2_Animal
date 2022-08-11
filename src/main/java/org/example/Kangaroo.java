package org.example;

public class Kangaroo extends Animal {

    public Kangaroo(String name, double weight, int age) {
        super(name, weight, age);
        sound = "Aaaarrrr.";
        diet = "Grass.";
    }
    public String toString() {
        return super.toString();
    }
}
