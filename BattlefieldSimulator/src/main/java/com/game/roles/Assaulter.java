package com.game.roles;

import com.game.strategy.RushEntry;

public class Assaulter extends Soldier {
    public Assaulter(String teamName) {
        super(new RushEntry(), teamName);
    }

    @Override
    public void displayRole() {
        System.out.println("[" + teamName + "] Role: Assaulter (Rusher)");
    }
}