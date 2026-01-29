package com.game.roles;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SupportTest {

    @Test
    void support_shouldUseSuppressingFireStrategy() {
        Soldier support = new Support();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        support.fight();

        assertTrue(out.toString().contains("laying down heavy LMG fire"));
    }
}
