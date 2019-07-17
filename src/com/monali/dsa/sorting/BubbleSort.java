package com.monali.dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public void sortArray(int[] numberArray) {

        for (int i = 0; i < numberArray.length - 1; i++) {
            boolean isAlreadySorted = true;
            for (int j = 0; j < numberArray.length - i - 1; j++) {
                if (numberArray[j] > numberArray[j + 1]) {
                    int temp = numberArray[j];
                    numberArray[j] = numberArray[j +1 ];
                    numberArray[j + 1] = temp;
                    isAlreadySorted = false;
                }
            }
            System.out.println("iteration " + i);
            if (isAlreadySorted){
                break;
            }

        }
    }
    public static void main(String[] args) {
        int[] numArr = new int[] {1, 3, 4, 12, 22, 99};
        BubbleSort bubbleSortObject = new BubbleSort();
        bubbleSortObject.sortArray(numArr);
        System.out.println(Arrays.toString(numArr));
    }
}
