package com.game.roles;

import com.game.strategy.RushEntry;

public class Assaulter extends Soldier {
    public Assaulter() {
        super(new RushEntry());
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Assaulter (Entry Fragger)");
    }
}