package com.dsa.logic;

/**
 * Verificação de Par ou Ímpar.
 *
 * Dado um número inteiro, retornar "Even" se for par
 * ou "Odd" se for ímpar.
 *
 * Exemplos:
 * 4  -> "Even"
 * 7  -> "Odd"
 * 0  -> "Even"
 * -3 -> "Odd"
 */
public class EvenOrOdd {
    public static String check(int n) {
        if (n % 2 == 0)
            return "Even";
        else
            return "Odd";
    }
}
