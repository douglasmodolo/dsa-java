package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

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
