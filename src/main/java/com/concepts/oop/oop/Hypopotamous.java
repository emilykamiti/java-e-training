package com.concepts.oop.oop;

public class Hypopotamous extends Animal {

    @Override
    public void move() {
        System.out.println("Hypos: Move in water & land");
    }

    @Override
    public void eat() {
        System.out.println("Hypos: Are harbivores");
    }
}
