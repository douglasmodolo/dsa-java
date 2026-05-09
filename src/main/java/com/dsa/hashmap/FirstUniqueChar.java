package com.dsa.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Primeiro caractere não repetido.
 *
 * Dada uma String, retornar o primeiro caractere que aparece apenas uma vez.
 * Se não existir, retornar ' ' (espaço).
 *
 * Exemplos:
 * "banana" -> 'b'
 * "aabb"   -> ' '
 * "java"   -> 'j'
 */
public class FirstUniqueChar {

    public static char findFirstUnique(String str) {
        if (str == null || str.isEmpty())
            return ' ';

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (map.getOrDefault(c, 0) == 1)
                return c;
        }

        return ' ';
    }
}
