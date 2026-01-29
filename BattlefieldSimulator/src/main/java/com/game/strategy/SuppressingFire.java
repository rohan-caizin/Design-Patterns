package com.game.strategy;

public class SuppressingFire implements CombatStyle {
    public void executeTactics() {
        System.out.println("ACTION: Throwing smoke grenades and laying down heavy LMG fire.");
    }
}