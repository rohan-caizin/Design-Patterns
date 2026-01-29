package com.example.duck.duck;

import com.example.duck.behaviours.FlyWithWings;
import com.example.duck.behaviours.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
