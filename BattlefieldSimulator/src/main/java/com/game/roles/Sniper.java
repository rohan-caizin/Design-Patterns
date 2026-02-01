package com.game.roles;

import com.game.strategy.HoldAngle;

public class Sniper extends Soldier {
    public Sniper(String teamName) {
        super(new HoldAngle(), teamName);
    }

    @Override
    public void displayRole() {
        System.out.println("[" + teamName + "] Role: Sniper (Long Range)");
    }
}