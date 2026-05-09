package com.dsa.hashmap;

import java.util.*;

/**
 * Agrupamento de Anagramas.
 *
 * Dada uma lista de strings, agrupar as palavras que são anagramas entre si.
 * Palavras que, quando ordenadas alfabeticamente, produzem a mesma string,
 * são consideradas anagramas.
 * Retorna mapa vazio se a lista for nula ou vazia.
 *
 * Exemplos:
 * ["eat","tea","tan","ate","nat","bat"] -> {aet=[eat,tea,ate], ant=[tan,nat], abt=[bat]}
 * ["abc","cba","bac","xyz"]            -> {abc=[abc,cba,bac], xyz=[xyz]}
 */
public class GroupAnagrams {

    public static Map<String, List<String>> group(List<String> words) {
        Map<String, List<String>> map = new HashMap<>();

        if (words == null || words.isEmpty())
            return map;

        List<String> listBase = new ArrayList<>();
        listBase.addAll(words);

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            String sortedWord = sortStr(word);
            map.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        return map;
    }

    private static String sortStr(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }
}
