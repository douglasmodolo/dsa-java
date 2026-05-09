package com.dsa.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUniqueCharTest {

    @Test
    void deveRetornarPrimeiroCharUnico() {
        assertEquals('b', FirstUniqueChar.findFirstUnique("banana"));
        assertEquals('j', FirstUniqueChar.findFirstUnique("java"));
        assertEquals('g', FirstUniqueChar.findFirstUnique("agua"));
    }

    @Test
    void deveRetornarEspacoQuandoNaoExistirCharUnico() {
        assertEquals(' ', FirstUniqueChar.findFirstUnique("aabb"));
    }

    @Test
    void deveRetornarEspacoQuandoStringVazia() {
        assertEquals(' ', FirstUniqueChar.findFirstUnique(""));
    }

    @Test
    void deveRetornarEspacoQuandoStringNull() {
        assertEquals(' ', FirstUniqueChar.findFirstUnique(null));
    }
}
