package com.dsa.strings;

/**
 * Verificação de Palíndromo.
 *
 * Dada uma String, verificar se ela é um palíndromo,
 * ou seja, se é igual lida de frente para trás.
 * Retorna false se a entrada for nula ou vazia.
 *
 * Exemplos:
 * "arara" -> true
 * "ana"   -> true
 * "Java"  -> false
 */
public class Palindrome {

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty())
            return false;

        String lower = str.toLowerCase();
        String reversedStr = StringReversal.reverse(lower);
        return lower.equals(reversedStr);
    }
}
