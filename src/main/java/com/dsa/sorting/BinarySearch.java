package com.dsa.sorting;

/**
 * Busca Binária.
 *
 * Dado um array de inteiros ORDENADO e um valor alvo (target),
 * retornar o índice onde o target se encontra.
 * Retorna -1 se não encontrado ou se o array for nulo/vazio.
 *
 * Complexidade: O(log n) — a cada passo descarta metade do array.
 *
 * Exemplo:
 * [1,2,3,4,5,6,7], target=5 -> 4
 * [1,2,3,4,5,6,7], target=8 -> -1
 *
 * Funcionamento:
 * arr=[1,2,3,4,5,6,7], target=5
 * meio=3, arr[3]=4 → 5 > 4 → descarta esquerda
 * arr=[5,6,7], meio=5, arr[5]=6 → 5 < 6 → descarta direita
 * arr=[5], meio=4, arr[4]=5 → encontrou! retorna 4
 */
public class BinarySearch {

    public static int search(int[] arr, int target) {
        if (arr == null)
            return -1;

        int esquerda = 0;
        int direita = arr.length - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;

            if (arr[meio] == target)
            {
                return meio;
            } else if (arr[meio] < target) {
                esquerda = meio + 1;
            }else if (arr[meio] > target) {
                direita = meio - 1;
            }
        }

        return -1;
    }
}
