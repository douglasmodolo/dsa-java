package com.dsa.sorting;

import java.util.Arrays;

/**
 * Merge Sort.
 *
 * Dado um array de inteiros, ordenar em ordem crescente
 * usando o algoritmo Merge Sort.
 * Retorna array vazio se nulo.
 *
 * Complexidade: O(n log n)
 *
 * Exemplo:
 * [5,3,1,4,2] -> [1,2,3,4,5]
 *
 * Funcionamento:
 * [5,3,1,4,2]
 *    ↙      ↘
 * [5,3]    [1,4,2]
 *  ↙  ↘    ↙    ↘
 * [5] [3] [1]  [4,2]
 *                ↙ ↘
 *               [4] [2]
 * Junta em ordem → [1,2,3,4,5]
 */
public class MergeSort {

    public static int[] sort(int[] arr) {
        if (arr == null) return new int[0];
        if (arr.length <= 1) return arr;  // caso base da recursão

        int meio = arr.length / 2;

        // copia a metade esquerda
        int[] esquerda = Arrays.copyOfRange(arr, 0, meio);
        // copia a metade direita
        int[] direita = Arrays.copyOfRange(arr, meio, arr.length);

        // chama recursivamente e junta
        return merge(sort(esquerda), sort(direita));
    }

    private static int[] merge(int[] esquerda, int[] direita) {
        int[] resultado = new int[esquerda.length + direita.length];
        int i = 0; // índice da esquerda
        int j = 0; // índice da direita
        int k = 0; // índice do resultado

        // enquanto houver elementos nos dois arrays
        while (i < esquerda.length && j < direita.length) {
            if (esquerda[i] <= direita[j]) {
                resultado[k] = esquerda[i];
                i++;
            } else {
                resultado[k] = direita[j];
                j++;
            }
            k++;
        }

        // copia o que sobrou da esquerda
        while (i < esquerda.length) {
            resultado[k] = esquerda[i];
            i++;
            k++;
        }

        // copia o que sobrou da direita
        while (j < direita.length) {
            resultado[k] = direita[j];
            j++;
            k++;
        }

        return resultado;
    }
}
