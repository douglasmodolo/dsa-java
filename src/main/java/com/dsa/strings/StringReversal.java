package com.dsa.strings;

/**
 * Inversão de String.
 *
 * Dada uma String, retornar ela invertida.
 * Retorna string vazia se a entrada for nula ou vazia.
 *
 * Exemplos:
 * "Douglas" -> "salguoD"
 * "Java"    -> "avaJ"
 */
public class StringReversal {
    public static String reverse(String str) {
        if (str == null || str.isEmpty())
            return "";

        StringBuilder revertedString = new StringBuilder();
        for (int i = str.length()-1; i  >= 0; i--) {
            revertedString.append(str.charAt(i));
        }

        return revertedString.toString();
    }
}
