package com.dsa.hashmap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    void deveRetornarListaTratada() {
        int[] arr = new int[] { 1, 2, 3, 2, 4, 3, 5 };
        List<Integer> result = List.of(1, 2, 3, 4, 5);
        assertEquals(result, RemoveDuplicates.remove(arr));
    }

    @Test
    void deveRetornarListaTratadaComOutroCenario() {
        int[] arr = new int[] { 1, 1, 1, 1, 1 };
        List<Integer> result = List.of(1);
        assertEquals(result, RemoveDuplicates.remove(arr));
    }

    @Test
    void deveRetornarListaVaziaSeArrayForNull() {
        List<Integer> result = new ArrayList<>();
        assertEquals(result, RemoveDuplicates.remove(null));
    }

    @Test
    void deveRetornarListaVaziaSeArrayVazio() {
        List<Integer> result = new ArrayList<>();
        assertEquals(result, RemoveDuplicates.remove(new int[0]));
    }
}
