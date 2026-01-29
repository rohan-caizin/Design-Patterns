package com.game.roles;

import com.game.strategy.SuppressingFire;

public class Support extends Soldier {
    public Support() {
        super(new SuppressingFire());
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Support Specialist");
    }
}