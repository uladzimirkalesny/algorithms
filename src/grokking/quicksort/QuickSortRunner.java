package grokking.quicksort;

import java.util.Arrays;

/*
O(n * log n)
 */
public class QuickSortRunner {
    public static void main(final String[] args) {
        final int[] array = {
                1, 4, 3, 2, 6, 10, 8, 9, 7
        };

        final int lowIndex = 0;
        final int highIndex = array.length - 1;

        quickSort(array, lowIndex, highIndex);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(final int[] array, final int lowIndex, final int highIndex) {
        final int middle = lowIndex + (highIndex - lowIndex) / 2;
        final int pivot = array[middle];

        int i = lowIndex;
        int j = highIndex;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                final int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (lowIndex < j) {
            quickSort(array, lowIndex, j);
        }

        if (highIndex > i) {
            quickSort(array, i, highIndex);
        }
    }
}
