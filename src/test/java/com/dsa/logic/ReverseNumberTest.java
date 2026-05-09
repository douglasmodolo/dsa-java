package com.dsa.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseNumberTest {

    @Test
    void deveRetornarNumeroPositivoInvertido() {
        assertEquals(321, ReverseNumber.reverse(123));
        assertEquals(1, ReverseNumber.reverse(100));
    }

    @Test
    void deveRetornarNumeroNegativoInvertido() {
        assertEquals(-456, ReverseNumber.reverse(-654));
    }
}
