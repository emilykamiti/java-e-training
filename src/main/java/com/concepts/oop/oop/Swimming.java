package com.concepts.oop.oop;

import java.util.ArrayList;
import java.util.List;

public class Swimming {
    public static void animalSwims() {
        System.out.println();
        List<SwimI> swimmers = new ArrayList<>();
        System.out.println("Swimmers:");
        swimmers.add(new Fish());
        swimmers.add(new Hypopotamous());

        for (SwimI swimmer : swimmers) {
            swimmer.swim();
        }
    }
}
