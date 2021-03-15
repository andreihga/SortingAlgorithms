package org;

public class BubbleSort {
    public static int[] bubbleSort(int[] unsortedArray) {
        boolean madeChanges = true;
        while (madeChanges) {
            madeChanges = false;
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if (unsortedArray[i] > unsortedArray[i + 1]) {
                    int aux = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i + 1];
                    unsortedArray[i + 1] = aux;
                    madeChanges = true;
                }
            }
        }
        return unsortedArray;
    }

    public static int[] descendingBubbleSort(int[] unsortedArray) {
        boolean madeChanges = true;
        while (madeChanges) {
            madeChanges = false;
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if (unsortedArray[i] < unsortedArray[i + 1]) {
                    int aux = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i + 1];
                    unsortedArray[i + 1] = aux;
                    madeChanges = true;
                }
            }
        }
        return unsortedArray;
    }
}
