package com.dsa.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    void deveRetornarIndiceDoTarget() {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        assertEquals(4, BinarySearch.search(arr, 5));
    }


}
