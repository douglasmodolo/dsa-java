package com.dsa.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    @Test
    void deveOrdenarArrayEmOrdemCrescente() {
        int[] arr = {5, 3, 1, 4, 2};
        int[] result = {1, 2, 3, 4, 5};
        assertArrayEquals(result, MergeSort.sort(arr));
    }

    @Test
    void deveOrdenarArrayComElementosRepetidos() {
        int[] arr = {3, 1, 3, 2, 1};
        int[] result = {1, 1, 2, 3, 3};
        assertArrayEquals(result, MergeSort.sort(arr));
    }

    @Test
    void deveRetornarMesmoArraySeJaOrdenado() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = {1, 2, 3, 4, 5};
        assertArrayEquals(result, MergeSort.sort(arr));
    }

    @Test
    void deveRetornarArrayVazioSeNull() {
        assertArrayEquals(new int[0], MergeSort.sort(null));
    }

    @Test
    void deveRetornarMesmoArraySeUmElemento() {
        int[] arr = {42};
        assertArrayEquals(arr, MergeSort.sort(arr));
    }
}
