package org;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] unsortedArray = {6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(unsortedArray))); // sorted ascending BubbleSort
        System.out.println(Arrays.toString(BubbleSort.descendingBubbleSort(unsortedArray))); // sorted descending BubbleSort
    }
}
