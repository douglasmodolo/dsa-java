package com.dsa.logic;

/**
 * Número Invertido.
 *
 * Dado um número inteiro, retornar ele com os dígitos invertidos.
 * Deve funcionar com números negativos.
 *
 * Exemplos:
 * 123  -> 321
 * -456 -> -654
 * 100  -> 1
 */
public class ReverseNumber {

    public static int reverse(int n) {
        boolean isEven = n > 0;

        String str = String.valueOf(n).replace("-","");

        StringBuilder revertedString = new StringBuilder();
        for (int i = str.length()-1; i  >= 0; i--) {
            revertedString.append(str.charAt(i));
        }

        if (isEven)
            return Integer.parseInt(revertedString.toString());
        else
            return Integer.parseInt(revertedString.toString()) * -1;
    }
}
