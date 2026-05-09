package com.dsa.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Contagem de Caracteres.
 *
 * Dada uma String, retornar um mapa com a frequência
 * de cada caractere presente na String.
 * Retorna mapa vazio se a entrada for nula ou vazia.
 *
 * Exemplos:
 * "banana" -> {b=1, a=3, n=2}
 * "java"   -> {j=1, a=2, v=1}
 */
public class CharacterCount {

    public static Map<Character, Integer> count(String str) {
        if (str == null || str.isEmpty())
            return new HashMap<Character, Integer>();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }
}
