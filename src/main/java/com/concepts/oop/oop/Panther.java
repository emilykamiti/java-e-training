package com.concepts.oop.oop;

public class Panther extends Animal {

    @Override
    public void move(){
        System.out.println("Panthers: Move on land");
    }

    @Override
    public void eat(){
        System.out.println("Panthers: Are carnivorous");
    }
}
