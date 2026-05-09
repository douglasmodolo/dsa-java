package com.dsa.strings;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterCountTest {

    @Test
    void deveRetornarQuantidadeCaracteresQuandoStringValida() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 5);
        assertEquals(map, CharacterCount.count("aaaaa"));
    }

    @Test
    void deveRetornarHashMapNullQuandoStringVazia() {
        Map<Character, Integer> map = new HashMap<>();
        assertEquals(map, CharacterCount.count(""));
    }

    @Test
    void deveRetornarHashMapNullQuandoStringNull() {
        Map<Character, Integer> map = new HashMap<>();
        assertEquals(map, CharacterCount.count(null));
    }
}
