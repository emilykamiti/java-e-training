package com.concepts.oop.oop;

import com.concepts.oop.WalkI;

public class Hypopotamous implements SwimI, WalkI {

    @Override
    public void walk() {
        System.out.println("- Hypos");
    }

    @Override
    public void swim() {
        System.out.println("- Hypos");
    }
}
