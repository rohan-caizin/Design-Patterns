package com.game.roles;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AssaulterTest {

    @Test
    void assaulter_shouldUseRushEntryStrategy() {
        Soldier assaulter = new Assaulter();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        assaulter.fight();

        assertTrue(out.toString().contains("Sprinting in first"));
    }
}
