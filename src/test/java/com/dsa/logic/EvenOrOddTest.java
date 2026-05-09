package com.dsa.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOddTest {

    @Test
    void deveRetornarEven() {
        assertEquals("Even", EvenOrOdd.check(0));
        assertEquals("Even", EvenOrOdd.check(2));
    }

    @Test
    void deveRetornarOdd() {
        assertEquals("Odd", EvenOrOdd.check(3));
        assertEquals("Odd", EvenOrOdd.check(-3));
    }
}
