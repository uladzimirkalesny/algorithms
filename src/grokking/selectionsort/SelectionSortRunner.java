package grokking.selectionsort;

import java.util.Arrays;

/**
 * O(n * n)
 */
public class SelectionSortRunner {
    public static void main(String[] args) {
        int[] array = {
                19, 2, 3, 4, 5, 499999999, 11, 9, 8, 6, 1
        };

        final int[] sortedArray = selectionSort(array);
        System.out.println(Arrays.toString(sortedArray));

    }

    private static int[] selectionSort(int[] array) {
        int[] resultArray = new int[array.length];

        for (int i = 0; i < resultArray.length; i++) {
            int smallValueIndex = findSmallValueIndex(array);
            resultArray[i] = array[smallValueIndex];
            array = decreaseArray(array, smallValueIndex);
        }

        return resultArray;
    }

    private static int[] decreaseArray(int[] array, int smallValueIndex) {
        int[] temp = new int[array.length - 1];

        for (int i = 0; i < array.length; i++) {
            if (i < smallValueIndex) {
                temp[i] = array[i];
            } else if (i > smallValueIndex) {
                temp[i - 1] = array[i];
            }
        }

        return temp;
    }

    private static int findSmallValueIndex(int[] array) {
        int smallValue = array[0];
        int smallValueIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallValue) {
                smallValue = array[i];
                smallValueIndex = i;
            }
        }

        return smallValueIndex;
    }
}
