package org;

public class MergeSort {
    public static int[] mergeSort(int[] unsortedArray) {

        if (unsortedArray.length == 1) {
            return unsortedArray;
        }

        int middleIndex = unsortedArray.length / 2;

        //we create 2 arrays
        int[] leftArray = new int[middleIndex];
        int[] rightArray = new int[unsortedArray.length - middleIndex];

        //we populate the arrays
        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = unsortedArray[i];
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = unsortedArray[middleIndex + i];
        }

        int[] result = new int[unsortedArray.length];
        // we call mergeSort until the arrays have 1 element each
        leftArray = mergeSort(leftArray);
        rightArray = mergeSort(rightArray);
        // once the arrays have 1 element, we start merging them back together
        return result = merge(leftArray, rightArray);

    }

    public static int[] merge(int[] leftArray, int[] rightArray) {

        int[] result = new int[leftArray.length + rightArray.length];

        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        //while there are elements in any of the arrays
        while (leftIndex < leftArray.length || rightIndex < rightArray.length) {
            //If both arrays have elements
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] > rightArray[rightIndex]) {
                    result[resultIndex++] = rightArray[rightIndex++];
                } else if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    result[resultIndex++] = leftArray[leftIndex++];
                } else {                        // if there are duplicates
                    result[resultIndex++] = leftArray[leftIndex++];
                    result[resultIndex++] = rightArray[rightIndex++];
                }
            } else if (leftIndex < leftArray.length) {    // if only the left array has elements
                result[resultIndex++] = leftArray[leftIndex];
            } else {                                       // if only the right array has elements
                result[resultIndex++] = rightArray[rightIndex++];
            }
        }
        return result;
    }
}
