package com.game.roles;


import com.game.strategy.CombatStyle;

public abstract class Soldier {
    protected CombatStyle combatStyle;

    public Soldier(CombatStyle style) {
        this.combatStyle = style;
    }

    public void fight() {
        combatStyle.executeTactics();
    }

    public void setCombatStyle(CombatStyle newStyle) {
        this.combatStyle = newStyle;
    }

    public void run() {
        System.out.println("MOVEMENT: Running forward...");
    }

    public void prone() {
        System.out.println("MOVEMENT: Going prone on the ground.");
    }

    public abstract void displayRole();
}