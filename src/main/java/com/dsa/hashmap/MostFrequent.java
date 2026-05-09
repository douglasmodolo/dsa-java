package com.dsa.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Elemento Mais Frequente.
 *
 * Dado um array de inteiros, retornar o elemento
 * que aparece com maior frequência.
 * Em caso de empate, retornar o que aparece primeiro.
 * Retorna -1 se o array for nulo ou vazio.
 *
 * Exemplos:
 * [1,2,2,3,3,3] -> 3
 * [1,1,2,2]     -> 1 (empate, retorna o primeiro)
 * [5]           -> 5
 */
public class MostFrequent {

    public static int findMostFrequent(int[] arr) {
        int mostFrequent = -1;

        if (arr == null)
            return mostFrequent;

        Map<Integer, Integer> map = new HashMap<>();
        int maiorQuantidade = 0;

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (map.get(num) > maiorQuantidade) {
                maiorQuantidade = map.get(num);
                mostFrequent = num;
            }
        }

        return mostFrequent;
    }
}
