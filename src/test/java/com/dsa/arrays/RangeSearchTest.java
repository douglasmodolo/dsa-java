package com.dsa.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeSearchTest {

    @Test
    void deveRetornarORangeCorreto() {
        int[] arr = {1, 2, 3, 4, 5};
        Integer l = 2;
        Integer r = 4;
        List<Integer> list = List.of(2, 3, 4);
        assertEquals(list, RangeSearch.search(arr, l, r));
    }

    @Test
    void deveRetornarListaVaziaSeNaoEncontrarNumerosNoArray() {
        int[] arr = {1, 2, 3, 4, 5};
        Integer l = 6;
        Integer r = 7;
        List<Integer> list = new ArrayList<>();
        assertEquals(list, RangeSearch.search(arr, l, r));
    }

    @Test
    void deveRetornarListVaziaSeArrayVazio() {
        int[] arr = new int[0];
        Integer l = 6;
        Integer r = 7;
        List<Integer> list = new ArrayList<>();
        assertEquals(list, RangeSearch.search(arr, l, r));
    }

    @Test
    void deveRetornarListaVaziaSeArrayNull() {
        Integer l = 6;
        Integer r = 7;
        List<Integer> list = new ArrayList<>();
        assertEquals(list, RangeSearch.search(null, l, r));
    }

}
