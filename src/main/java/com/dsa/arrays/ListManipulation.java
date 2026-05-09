package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

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
