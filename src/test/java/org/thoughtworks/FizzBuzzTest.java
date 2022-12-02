package org.thoughtworks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

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
    void shouldIfCheckMultiple3() {
        int number = 3;
        var actual = fizzBuzz.checkMultipleThree(number);
        assertEquals(true, actual);
    }

    @Test
    void shouldCheckIfNotMultiple3() {
        int number = 4;
        var actual = fizzBuzz.checkMultipleThree(number);
        assertEquals(false, actual);
    }

    @Test
    void shouldPrintNumbers1to100ReplacingMultiplesOf3ByFizz() {
        var actual = fizzBuzz.printNumbersFrom1To100();
        assertTrue(actual.contains("Fizz"));
        assertFalse(actual.contains("\n3\n"));
        assertFalse(actual.contains("\n6\n"));
        assertFalse(actual.contains("\n9\n"));
        assertFalse(actual.contains("\n12\n"));
        assertFalse(actual.contains("\n15\n"));
        assertEquals(outputStreamCaptor.toString().trim(), actual);
    }





}
