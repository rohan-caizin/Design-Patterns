package com.example.duck.duck;

import com.example.duck.behaviours.FlyBehavior;
import com.example.duck.behaviours.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    void swim() {
        System.out.println("All ducks float!");
    }

    public abstract void display();
}

