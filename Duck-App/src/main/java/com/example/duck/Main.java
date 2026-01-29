package com.example.duck;

import com.example.duck.behaviours.FlyWithWings;
import com.example.duck.duck.Duck;
import com.example.duck.duck.MallardDuck;
import com.example.duck.duck.RubberDuck;


public class Main {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("-----");

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();
    }
}

