package com.dsa.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {

    @Test
    void deveRetornarArrayEmOrdemCrescente() {
        int[] arr = new int[] { 3, 0, 1, 8, 7, 2, 5, 4, 6, 9 };
        int[] result = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        assertArrayEquals(result, BubbleSort.sort(arr));
    }

    @Test
    void deveRetornarArrayVazioSeEnviadoArrayNull() {
        assertArrayEquals(new int[0], BubbleSort.sort(null));
    }

    @Test
    void deveRetornarArrayVazioSeEnviadoArrayVazio() {
        assertArrayEquals(new int[0], BubbleSort.sort(new int[0]));
    }
}
