package com.game.observer;

import com.game.event.GameEvent;
import com.game.roles.Soldier;

public class MatchFeed implements GameObserver {
    @Override
    public void update(Soldier soldier, GameEvent event) {
        // Global feed sees everything
        System.out.println("[GLOBAL FEED] (" + soldier.getTeamName() + ") "
                + soldier.getClass().getSimpleName()
                + " -> " + event);
    }
}