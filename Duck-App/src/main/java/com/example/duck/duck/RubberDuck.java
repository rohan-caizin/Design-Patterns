package com.example.duck.duck;

import com.example.duck.behaviours.FlyNoWay;
import com.example.duck.behaviours.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a Rubber Duck");
    }
}
