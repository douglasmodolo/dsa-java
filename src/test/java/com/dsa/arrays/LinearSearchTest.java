package com.dsa.arrays;

import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSearchTest {

    @Test
    void deveRetornarPosicaoDoInteiroNoArray() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(0, LinearSearch.search(arr, 1));
        assertEquals(1, LinearSearch.search(arr, 2));
        assertEquals(2, LinearSearch.search(arr, 3));
        assertEquals(3, LinearSearch.search(arr, 4));
        assertEquals(4, LinearSearch.search(arr, 5));
    }

    @Test
    void deveRetornarNegativoSeNaoEncontrarNoArray() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(-1, LinearSearch.search(arr, 9));
    }

    @Test
    void deveRetornarNegativoSeArrayVazio() {
        int[] arr = new int[0];
        assertEquals(-1, LinearSearch.search(arr, 6));
    }

    @Test
    void deveRetornarNegativoSeArrayNull() {
        int[] arr = null;
        assertEquals(-1, LinearSearch.search(arr, 6));
    }
}
