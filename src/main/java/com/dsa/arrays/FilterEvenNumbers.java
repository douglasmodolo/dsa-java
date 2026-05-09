package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Filtro de Números Pares.
 *
 * Dado um array de inteiros, retornar uma lista
 * contendo apenas os números pares.
 * Retorna lista vazia se o array for nulo.
 *
 * Exemplos:
 * [1,2,3,4,5,6] -> [2,4,6]
 * [1,3,5]       -> []
 */
public class FilterEvenNumbers {

    public static List<Integer> filter(int[] arr) {
        List<Integer> result = new ArrayList<>();

        if (arr == null)
            return result;

        for (int j : arr) {
            if (j % 2 == 0)
                result.add(j);
        }

        return result;
    }
}
