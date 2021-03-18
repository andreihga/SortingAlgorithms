package org;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] unsortedArray = {10, 6, 8, 5, 7, 4, 1, 2};
//        System.out.println("Bubble sort: " + Arrays.toString(BubbleSort.bubbleSort(unsortedArray))); // sorted ascending BubbleSort
//        System.out.println(Arrays.toString(BubbleSort.descendingBubbleSort(unsortedArray))); // sorted descending BubbleSort

//        System.out.println("Merge sort " + Arrays.toString(MergeSort.mergeSort(unsortedArray)));
        System.out.println("Quick sort " + Arrays.toString(QuickSort.quickSort(unsortedArray, 0, unsortedArray.length-1)));
    }
}
