package com.concepts.oop;


import com.concepts.oop.oop.Fish;
import com.concepts.oop.oop.Hypopotamous;
import com.concepts.oop.oop.Panther;

public class App 
{
    public static void main( String[] args )
    {
        Fish fish = new Fish();
        fish.eat();
        fish.rest();
        fish.move();

        Hypopotamous hypo = new Hypopotamous();
        hypo.eat();
        hypo.rest();

        Panther panther = new Panther();
        panther.eat();
        panther.rest();

        
    }
}
