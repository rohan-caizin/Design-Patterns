package com.game.observer;

import com.game.roles.Soldier;
import com.game.event.GameEvent;

public interface GameObserver {
    void update(Soldier soldier, GameEvent event);
}