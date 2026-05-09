package com.dsa.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * Sequência de Fibonacci.
 *
 * Dado um número n, retornar os primeiros n números da sequência de Fibonacci.
 * Cada número é a soma dos dois anteriores.
 * Retorna lista vazia se n <= 0.
 *
 * Exemplos:
 * n=1  -> [0]
 * n=2  -> [0, 1]
 * n=7  -> [0, 1, 1, 2, 3, 5, 8]
 */
public class Fibonacci {

    public static List<Integer> generate(int n) {
        List<Integer> list = new ArrayList<>();

        if (n <= 0)
            return list;

        list.add(0);
        if (n == 1)
            return list;
        list.add(1);

        for (int i = 0; i < n - 2; i++) {
            int proximo = list.getLast() + list.get(i);
            list.add(proximo);
        }

        return list;
    }
}
