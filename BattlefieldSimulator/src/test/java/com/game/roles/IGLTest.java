package com.game.roles;

import com.game.strategy.HoldAngle;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IGLTest {

    @Test
    void igl_shouldSwitchStrategyDuringGame() {
        Soldier igl = new IGL();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        igl.fight();
        igl.setCombatStyle(new HoldAngle());
        igl.fight();

        String output = out.toString();
        assertTrue(output.contains("trade kills"));
        assertTrue(output.contains("Holding a Sniper Rifle"));
    }
}
