package com.dsa.strings;

import java.util.Arrays;

/**
 * Verificação de Anagrama.
 *
 * Dadas duas Strings, verificar se são anagramas,
 * ou seja, se contêm exatamente as mesmas letras na mesma quantidade.
 * Retorna false se qualquer entrada for nula ou vazia.
 *
 * Exemplos:
 * "listen", "silent" -> true
 * "roma",   "amor"   -> true
 * "java",   "vaga"   -> false
 */
public class Anagrams {

    public static boolean isAnagram(String str1, String str2) {
        if (str1 == null || str1.isEmpty() || str2 == null || str2.isEmpty())
            return false;

        boolean isAnagram = sortStr(str1.toLowerCase()).equals(sortStr(str2.toLowerCase()));
        return isAnagram;
    }

    private static String sortStr(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }
}
