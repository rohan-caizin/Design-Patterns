package com.game;

import com.game.roles.*;
import com.game.strategy.HoldAngle;

public class MatchSimulator {
    public static void main(String[] args) {
        
        System.out.println("--- ROUND START --");

        Soldier blue = new Sniper();
        Soldier red = new Assaulter();
        Soldier green = new IGL();

        blue.displayRole();
        blue.fight();
        
        System.out.println();
        
        red.displayRole();
        red.fight();
        
        System.out.println();

        green.displayRole();
        green.fight();
        
        System.out.println("IGL picks up the fallen Sniper's weapon...");
        green.setCombatStyle(new HoldAngle());
        green.fight();
    }
}