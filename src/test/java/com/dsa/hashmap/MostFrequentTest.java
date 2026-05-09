package com.dsa.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MostFrequentTest {

    @Test
    void deveRetornarInteiroMaisFrequenteListaSimples() {
        int[] arr = new int[]{ 1,2,2,3,3,3 };
        assertEquals(3, MostFrequent.findMostFrequent(arr));
    }

    @Test
    void deveRetornarPrimeiroInteiroMaisFrequenteListaSimples() {
        int[] arr = new int[]{ 1,2,2,2,3,3,3 };
        assertEquals(2, MostFrequent.findMostFrequent(arr));
    }

    @Test
    void deveRetornarUnicoInteiroQuandoListaDeUnicoValor() {
        assertEquals(1, MostFrequent.findMostFrequent(new int[]{1}));
    }
}
