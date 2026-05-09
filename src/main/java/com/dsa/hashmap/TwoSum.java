package com.dsa.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Dois Somados (Two Sum).
 *
 * Dado um array de inteiros e um valor alvo (target),
 * retornar os índices de dois números que somados resultam no target.
 * Retorna array vazio se não encontrar ou se o array for nulo.
 *
 * Exemplos:
 * [2,7,11,15], target=9  -> [0,1] (2+7=9)
 * [3,2,4],    target=6  -> [1,2] (2+4=6)
 * [1,2,3],    target=10 -> []
 */
public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {

        if (arr == null || arr.length < 2)
            return new int[0];

        int[] result = new int[2];
        // Primeiro integer será o valor e o segundo o índice
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int expectedValue = target - arr[i];

            if (map.containsKey(expectedValue))
            {
                return new int[]{map.get(expectedValue), i};
            }

            map.put(arr[i], i);
        }

        return new int[0];
    }

    /**
    *
    * O método abaixo entrega o que foi solicitado porém com a complexidade On2
    *
    public static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] + arr[j] == target)
                    {
                        result[0] = i;
                        result[1] = j;
                        break;
                    }
                }
            }
        }

        return result;
    }
     */
}
