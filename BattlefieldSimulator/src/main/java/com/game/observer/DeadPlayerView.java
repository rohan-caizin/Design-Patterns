package com.game.observer;

import com.game.event.GameEvent;
import com.game.roles.Soldier;

public class DeadPlayerView implements GameObserver {

    private final String spectatorName;
    private final String myTeam;

    public DeadPlayerView(String name, String team) {
        this.spectatorName = name;
        this.myTeam = team;
    }

    @Override
    public void update(Soldier soldier, GameEvent event) {
        // LOGIC: Only show info if the soldier is on MY team
        if (soldier.getTeamName().equals(this.myTeam)) {
            System.out.println("   [SPECTATOR: " + spectatorName + "] (Teammate View) "
                    + soldier.getClass().getSimpleName()
                    + " -> " + event);
        }
        // If it's an enemy, do nothing (Hidden)
    }
}