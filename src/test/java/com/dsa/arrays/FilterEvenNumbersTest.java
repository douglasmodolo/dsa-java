package com.dsa.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterEvenNumbersTest {

    @Test
    void deveRetornarArrayComPares() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        List<Integer> result = List.of(2, 4, 6);
        assertEquals(result, FilterEvenNumbers.filter(arr));
    }

    @Test
    void deveRetornarArrayVazioQuandoApenasImpares() {
        int[] arr = {3, 5, 7};
        List<Integer> result = new ArrayList<>();
        assertEquals(result, FilterEvenNumbers.filter(arr));
    }

    @Test
    void deveRetornarArrayVazioQuandoPassadoArrayVazio() {
        int[] arr = new int[0];
        List<Integer> result = new ArrayList<>();
        assertEquals(result, FilterEvenNumbers.filter(arr));
    }

    @Test
    void deveRetornarArrayVazioQuandoPassadoArrayNull() {
        List<Integer> result = new ArrayList<>();
        assertEquals(result, FilterEvenNumbers.filter(null));
    }
}
