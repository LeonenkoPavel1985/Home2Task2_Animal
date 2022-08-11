package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        System.out.println("TIGER:");
        Tiger tiger = new Tiger("Sherkhan", 120, 15);
        System.out.println(tiger.toString());
        tiger.doSound();
        tiger.showDiet();
        System.out.println("CROCODILE:");
        Crocodile crocodile = new Crocodile("Gena", 250, 20);
        System.out.println(crocodile.toString());
        crocodile.doSound();
        crocodile.showDiet();
        System.out.println("KANGAROO:");
        Kangaroo kangaroo = new Kangaroo("Genri", 100, 3);
        System.out.println(kangaroo.toString());
        kangaroo.doSound();
        kangaroo.showDiet();
    }
}