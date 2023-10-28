package com.concepts.oop.oop;

import java.util.ArrayList;
import java.util.List;

public class Walking {
    public static void aniimalWalks() {
        List<WalkI> walkers = new ArrayList<>();
        System.out.println();
        System.out.println("Walkers:");
        walkers.add(new Hypopotamous());
        walkers.add(new Panther());

        for (WalkI walker : walkers) {
            walker.walk();
        }
        System.out.println();
    }
}
