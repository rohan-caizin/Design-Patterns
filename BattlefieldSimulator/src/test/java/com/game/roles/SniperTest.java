package com.game.roles;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SniperTest {

    @Test
    void sniper_shouldUseHoldAngleStrategy() {
        Soldier sniper = new Sniper();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        sniper.fight();

        assertTrue(out.toString().contains("Holding a Sniper Rifle"));
    }
}
