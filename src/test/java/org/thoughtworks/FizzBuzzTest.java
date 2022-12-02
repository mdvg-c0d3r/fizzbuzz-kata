package org.thoughtworks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        fizzBuzz = new FizzBuzz();
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void shouldPrintNumbers1to100InDifferentLines() {
        var actual = fizzBuzz.printNumbersFrom1To100();
        assertEquals(outputStreamCaptor.toString().trim(), actual);
    }

    @Test
    void shouldCheckMultiple3() {
        int number = 3;
        var actual = fizzBuzz.checkMultipleThree(number);
        assertEquals(true, actual);
    }

}