package com.dsa.strings;

import java.util.HashSet;

/**
 * Remoção de Duplicatas.
 *
 * Dada uma String, retornar ela sem caracteres repetidos,
 * mantendo a ordem de aparição.
 * Retorna string vazia se a entrada for nula ou vazia.
 *
 * Exemplos:
 * "banana" -> "ban"
 * "java"   -> "jav"
 * "aabbcc" -> "abc"
 */
public class DuplicateRemoval {

    public static String removeDuplicates(String str) {
        if (str == null || str.isEmpty())
            return "";

        HashSet<Character> hash = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray())
        {
            if (!hash.contains(c))
            {
                hash.add(c);
                result.append(c);
            }
        }

        return result.toString();
    }
}
