package com.dsa.arrays;

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
