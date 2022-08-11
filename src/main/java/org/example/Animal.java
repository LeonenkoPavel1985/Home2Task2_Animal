package org.example;

public class Animal {
    public String name;
    public double weight;
    public int age;
    public String diet = "Meat";
    public String sound = "...";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight(double weight) {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Animal (String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public String toString() {
       return "Name - " + name + ", " + "weight - " + weight + " kilogram , " + "age - " +  age + " years.";
    }
    void doSound() {
        System.out.println("Sound:" + sound);
    }
    void showDiet() {
        System.out.println("Diet: "+ diet);
    }
}
