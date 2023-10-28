package com.concepts.oop;

import com.concepts.oop.oop.Animal;
import com.concepts.oop.oop.Fish;
import com.concepts.oop.oop.Hypopotamous;
import com.concepts.oop.oop.Panther;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Fish());
        animals.add(new Hypopotamous());
        animals.add(new Panther());

        for (Animal animal : animals)
        animal.rest();

    }
}
