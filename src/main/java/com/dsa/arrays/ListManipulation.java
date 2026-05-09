package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Manipulação de Listas.
 *
 * insert: dado uma lista e um elemento, inserir o elemento no final.
 * remove: dado uma lista e um índice, remover o elemento naquela posição.
 * Retorna lista vazia se a lista for nula ou o índice inválido.
 *
 * Exemplos:
 * insert([1,2,3], 4)    -> [1,2,3,4]
 * remove([1,2,3,4], 1)  -> [1,3,4]
 */
public class ListManipulation {

    public static List<Integer> insert(List<Integer> list, int element) {
        List<Integer> result = new ArrayList<>();

        if (list == null)
            return result;

        result.addAll(list);
        result.add(element);

        return result;
    }

    public static List<Integer> remove(List<Integer> list, int index) {
        List<Integer> result = new ArrayList<>();

        if (list == null || list.isEmpty() || index < 0 || index >= list.size())
            return result;

        result.addAll(list);
        result.remove(index);

        return result;
    }
}
