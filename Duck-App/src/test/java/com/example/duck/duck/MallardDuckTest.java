package com.example.duck.duck;

import org.junit.jupiter.api.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MallardDuckTest {

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
    void shouldFlyWithWings() {
        Duck mallard = new MallardDuck();
        mallard.performFly();

        assertTrue(out.toString().contains("flying with wings"));
    }

    @Test
    void shouldQuackNormally() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();

        assertTrue(out.toString().contains("Quack"));
    }

    @Test
    void shouldSwimSuccessfully() {
        Duck mallard = new MallardDuck();
        mallard.swim();

        assertTrue(out.toString().contains("float"));
    }
}
