package com.monali.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {
    public void sortArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            boolean isSorted = true;
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }

            }
            System.out.println("Iteration " + i);
            if (isSorted) {
                break;
            }

        }
    }

    public static void main(String[] args) {
        int[] numArr = new int[] {1, 3, 4, 12, 22, 99};
        InsertionSort obj = new InsertionSort();
        obj.sortArray(numArr);
        System.out.println(Arrays.toString(numArr));
    }
}
