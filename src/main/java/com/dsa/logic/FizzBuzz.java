package com.dsa.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * FizzBuzz.
 *
 * Dado um número n, retornar uma lista de strings de 1 até n onde:
 * - Múltiplos de 3 → "Fizz"
 * - Múltiplos de 5 → "Buzz"
 * - Múltiplos de 3 e 5 → "FizzBuzz"
 * - Demais números → o próprio número como string
 *
 * Exemplo com n=15:
 * [1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]
 */
public class FizzBuzz {

    public static List<String> generate(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0)
            {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }

        return list;
    }
}
