package com.game.observer;

import com.game.event.GameEvent;

public interface Subject {
    void addObserver(GameObserver observer);
    void removeObserver(GameObserver observer);
    void notifyObservers(GameEvent event);
}