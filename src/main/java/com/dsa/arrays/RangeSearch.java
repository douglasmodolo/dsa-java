package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Busca em Intervalo.
 *
 * Dado um array de inteiros e dois valores l e r,
 * retornar todos os elementos dentro do intervalo [l, r].
 * Retorna lista vazia se o array for nulo.
 *
 * Exemplos:
 * [1,5,3,8,2,7], l=3, r=7 -> [5,3,7]
 * [1,2,3], l=5, r=10       -> []
 */
public class RangeSearch {

    public static List<Integer> search(int[] arr, int l, int r) {

        List<Integer> result = new ArrayList<>();

        if (arr == null)
            return result;

        for (Integer a : arr) {
            if (a >= l && a <= r)
                result.add(a);
        }

        return result;
    }
}
