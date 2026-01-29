package com.game.roles;

import com.game.strategy.TradeRefrag;

// 3. THE IGL (In-Game Leader)
public class IGL extends Soldier {
    public IGL() {
        super(new TradeRefrag());
    }

    @Override
    public void displayRole() {
        System.out.println("Role: In-Game Leader (Shot Caller)");
    }
}