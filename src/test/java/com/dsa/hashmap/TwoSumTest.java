package com.dsa.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    @Test
    void deveRetornarIndicesDoisNumerosQueSomamOTarget() {
        int[] arr = {2, 7, 11, 15};
        int[] result = {0, 1};
        assertArrayEquals(result, TwoSum.twoSum(arr, 9));
    }

    @Test
    void deveRetornarIndicesCorretosComOutrosCenarios() {
        int[] arr = {3, 2, 4};
        int[] result = {1, 2};
        assertArrayEquals(result, TwoSum.twoSum(arr, 6));
    }

    @Test
    void deveRetornarArrayVazioQuandoNaoEncontrar() {
        int[] arr = {1, 2, 3};
        assertArrayEquals(new int[0], TwoSum.twoSum(arr, 10));
    }

    @Test
    void deveRetornarArrayVazioQuandoArrayNull() {
        assertArrayEquals(new int[0], TwoSum.twoSum(null, 9));
    }

    @Test
    void deveRetornarArrayVazioQuandoArrayComMenosDeDoisElementos() {
        int[] arr = {1};
        assertArrayEquals(new int[0], TwoSum.twoSum(arr, 9));
    }
}
