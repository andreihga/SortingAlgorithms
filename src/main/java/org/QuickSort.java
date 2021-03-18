package org;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static int[] quickSort(int[] unsortedArray, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(unsortedArray, start, end);
            quickSort(unsortedArray, start, partitionIndex - 1);
            quickSort(unsortedArray, partitionIndex + 1, end);
        }
        return unsortedArray;
    }

    public static int partition(int[] unsortedArray, int startIndex, int endIndex) {
        Random random = new Random();
        int pivot = random.nextInt((endIndex - startIndex) + 1) + startIndex;// (4-3)+1
        swapElements(unsortedArray, startIndex, pivot);
        int partitionIndex = startIndex + 1;
        for (int i = partitionIndex; i <= endIndex; i++) {
            if (unsortedArray[i] < unsortedArray[startIndex]) {
                swapElements(unsortedArray, partitionIndex, i);
                partitionIndex++;
            }
        }
        swapElements(unsortedArray, startIndex, partitionIndex - 1);
        return partitionIndex - 1;
    }

    public static void swapElements(int[] array, int a, int b) {
        int aux = array[a];
        array[a] = array[b];
        array[b] = aux;
    }
}
