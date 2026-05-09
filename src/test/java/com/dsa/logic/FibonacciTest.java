package com.dsa.logic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    void deveRetornarFibonacci() {
        List<Integer> list = List.of(0, 1, 1, 2, 3, 5, 8);
        assertEquals(list, Fibonacci.generate(7));
    }

    @Test
    void deveRetornarListaVazia() {
        List<Integer> list = new ArrayList<>();
        assertEquals(list, Fibonacci.generate(0));
        assertEquals(list, Fibonacci.generate(-1));
    }

    @Test
    void deveRetornarUmElementoQuandoNForUm() {
        List<Integer> list = List.of(0);
        assertEquals(list, Fibonacci.generate(1));
    }

    @Test
    void deveRetornarDoisElementosQuandoNForDois() {
        List<Integer> list = List.of(0, 1);
        assertEquals(list, Fibonacci.generate(2));
    }
}
