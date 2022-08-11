package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Tiger tiger = new Tiger("Sherkhan", 120, 15);
        System.out.println(tiger.toString());
        tiger.doSound();
        tiger.showDiet();
        Crocodile crocodile = new Crocodile("Gena", 250, 20);
        System.out.println(crocodile.toString());
        crocodile.doSound();
        crocodile.showDiet();
        Kangaroo kangaroo = new Kangaroo("Genri", 100, 3);
        System.out.println(kangaroo.toString());
        kangaroo.doSound();
        kangaroo.showDiet();
    }
}