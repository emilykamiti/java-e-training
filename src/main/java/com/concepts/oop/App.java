package com.concepts.oop;

import com.concepts.oop.oop.Fish;
import com.concepts.oop.oop.Hypopotamous;
import com.concepts.oop.oop.Panther;
import com.concepts.oop.oop.SwimI;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<SwimI> swimmers = new ArrayList<>();
        System.out.println();
        System.out.println("Swimmers:");
        swimmers.add(new Fish());
        swimmers.add(new Hypopotamous());

        for (SwimI swimmer : swimmers)
            swimmer.swim();

        System.out.println();

        System.out.println("walkers:");
        List<WalkI> walkers = new ArrayList<>();
        walkers.add(new Hypopotamous());
        walkers.add(new Panther());

        for (WalkI walker : walkers)
            walker.walk();

    }
}
