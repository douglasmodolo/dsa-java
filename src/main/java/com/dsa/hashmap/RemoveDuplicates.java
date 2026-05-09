package com.dsa.hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Eliminação de Duplicatas.
 *
 * Dado um array de inteiros, retornar uma lista
 * apenas com os elementos únicos, mantendo a ordem de aparição.
 * Retorna lista vazia se o array for nulo ou vazio.
 *
 * Exemplos:
 * [1,2,3,2,4,3,5] -> [1,2,3,4,5]
 * [1,1,1,1]       -> [1]
 * [1,2,3]         -> [1,2,3]
 */
public class RemoveDuplicates {

    public static List<Integer> remove(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        if (arr == null)
            return result;

        for (int a : arr) {
            if (!seen.contains(a))
            {
                seen.add(a);
                result.add(a);
            }
        }

        return result;
    }
}
