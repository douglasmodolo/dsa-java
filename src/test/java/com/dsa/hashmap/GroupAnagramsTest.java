package com.dsa.hashmap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAnagramsTest {

    @Test
    void deveRetornarMapDeAnagramasAgrupados() {
        List<String> baseList = List.of("eat","tea","tan","ate","nat","bat");

        Map<String, List<String>> map = new HashMap<>();

        List<String> list1 = List.of("eat","tea","ate");
        map.put("aet", list1);

        List<String> list2 = List.of("tan", "nat");
        map.put("ant", list2);

        List<String> list3 = List.of("bat");
        map.put("abt", list3);

        assertEquals(map, GroupAnagrams.group(baseList));
    }

    @Test
    void deveRetornarMapaVazioQuandoListaVazia() {
        List<String> baseList = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        assertEquals(map, GroupAnagrams.group(baseList));
    }

    @Test
    void deveRetornarMapaVazioQuandoListaNull() {
        Map<String, List<String>> map = new HashMap<>();

        assertEquals(map, GroupAnagrams.group(null));
    }
}
