package grokking.binarysearch;

import java.util.Arrays;

/**
 * O(log n)
 */
public class BinarySearchRunner {
    public static void main(String[] args) {
        int[] array = {
                10, 22, 5, 61, 12, 15, 623, 66, 77, 85, 89
        };

        final Integer stepNull = binarySearch(array, 3);
        System.out.println(stepNull);

        final Integer step = binarySearch(array, 61);
        System.out.println(step);
    }

    private static Integer binarySearch(int[] list, int item) {
        Arrays.sort(list);
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return null;
    }
}
