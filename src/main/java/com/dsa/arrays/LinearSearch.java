package com.dsa.arrays;

/**
 * Busca Linear.
 *
 * Dado um array de inteiros e um número k,
 * retornar o índice onde k se encontra.
 * Retorna -1 se não encontrado ou se o array for nulo/vazio.
 *
 * Exemplos:
 * [1,3,5,7,9], k=5 -> 2
 * [1,3,5,7,9], k=4 -> -1
 */
public class LinearSearch {

    public static int search(int[] arr, int k) {
        if (arr == null || arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                return i;
        }

        return -1;
    }
}
