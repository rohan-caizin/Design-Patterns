package com.game.roles;

import com.game.event.GameEvent;
import com.game.observer.GameObserver;
import com.game.observer.Subject;
import com.game.strategy.CombatStyle;
import java.util.ArrayList;
import java.util.List;

public abstract class Soldier implements Subject {

    protected CombatStyle combatStyle;
    protected String teamName; // <--- NEW: Team Identity
    private final List<GameObserver> observers = new ArrayList<>();

    public Soldier(CombatStyle style, String teamName) {
        this.combatStyle = style;
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void fight() {
        combatStyle.executeTactics();
        notifyObservers(GameEvent.ACTION_PERFORMED);
    }

    public void setCombatStyle(CombatStyle newStyle) {
        this.combatStyle = newStyle;
        notifyObservers(GameEvent.COMBAT_STYLE_CHANGED);
    }

    @Override
    public void addObserver(GameObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(GameObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(GameEvent event) {
        for (GameObserver observer : observers) {
            observer.update(this, event);
        }
    }

    public abstract void displayRole();
}