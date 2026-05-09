package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
