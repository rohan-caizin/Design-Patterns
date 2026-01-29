package com.example.duck.duck;

import com.example.duck.behaviours.FlyWithWings;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RubberDuckTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setup() {
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    void cleanup() {
        System.setOut(originalOut);
    }

    @Test
    void shouldNotFlyInitially() {
        Duck rubber = new RubberDuck();
        rubber.performFly();

        assertTrue(out.toString().contains("can't fly"));
    }

    @Test
    void shouldSqueakInsteadOfQuack() {
        Duck rubber = new RubberDuck();
        rubber.performQuack();

        assertTrue(out.toString().contains("Squeak"));
    }
}
