package com.dsa.sorting;

/**
 * Bubble Sort.
 *
 * Dado um array de inteiros, ordenar em ordem crescente
 * usando o algoritmo Bubble Sort.
 * Retorna array vazio se nulo.
 *
 * Complexidade: O(n²)
 *
 * Exemplo:
 *   [5, 3, 1, 4, 2]
 *   ↕
 *   [3, 5, 1, 4, 2]  → compara 5 e 3, troca
 *   [3, 1, 5, 4, 2]  → compara 5 e 1, troca
 *   [3, 1, 4, 5, 2]  → compara 5 e 4, troca
 *   [3, 1, 4, 2, 5]  → compara 5 e 2, troca
 *   ... repete até ordenar tudo
 */
public class BubbleSort {

    public static int[] sort(int[] arr) {
        if (arr == null)
            return new int[0];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}
