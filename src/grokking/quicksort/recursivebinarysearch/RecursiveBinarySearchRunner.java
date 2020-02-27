package grokking.quicksort.recursivebinarysearch;

public class RecursiveBinarySearchRunner {
    public static void main(final String[] args) {
        final int[] array = {
                1, 2, 4, 8, 16, 32, 64, 128
        };

        System.out.println(recursiveBinarySearch(array, 0, array.length, 64));
    }

    public static int recursiveBinarySearch(final int[] sortedArray, final int start, final int end, final int key) {
        if (start < end) {
            final int mid = start + (end - start) / 2;
            if (key < sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, start, mid, key);

            } else if (key > sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, mid + 1, end, key);

            } else {
                return mid;
            }
        }
        return -(start + 1);
    }
}
