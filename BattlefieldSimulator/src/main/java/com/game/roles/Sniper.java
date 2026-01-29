package com.game.roles;

import com.game.strategy.HoldAngle;

// 2. THE SNIPER
public class Sniper extends Soldier {
    public Sniper() {
        super(new HoldAngle());
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Dedicated Sniper");
    }
}