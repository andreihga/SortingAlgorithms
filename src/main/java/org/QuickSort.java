package org;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static int[] quickSort(int[] unsortedArray, int start, int end){
        if(start<end){
            int partitionIndex = partition(unsortedArray,start,end);
            quickSort(unsortedArray,start,partitionIndex-1);
            quickSort(unsortedArray,start,partitionIndex+1);
        }
        return unsortedArray;
    }

    public static int partition(int[] unsortedArray, int startIndex, int endIndex) {
        Random random = new Random();
        int pivot = random.nextInt(unsortedArray.length);
        int partitionIndex = startIndex;
        for (int i = startIndex; i < endIndex; i++) {
            if (unsortedArray[i] < unsortedArray[pivot]) {
                swapElements(unsortedArray,partitionIndex, i);
                partitionIndex++;
            }
        }
        swapElements(unsortedArray,partitionIndex,pivot);
        return partitionIndex;
    }

    public static void swapElements(int[] array, int a, int b) {
        int aux = array[a];
        array[a] = array[b];
        array[b] = aux;
    }
}
