package com.concepts.oop;

import com.concepts.oop.oop.Animal;
import com.concepts.oop.oop.Fish;
import com.concepts.oop.oop.Hypopotamous;
import com.concepts.oop.oop.Panther;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Animal fish = new Fish();
        fish.move();

        Animal hypo = new Hypopotamous();
        hypo.move();

        Animal panther = new Panther();
        panther.move();

        List<Animal> animals = new ArrayList<>();
        animals.add(new Hypopotamous());
        animals.add(new Panther());
        animals.add(new Fish());

        for (Animal animal : animals)
        animal.eat();
        //animal.rest();

    }
}
