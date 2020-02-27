package grokking.quicksort.recursivemax;

import java.util.Arrays;

public class RecursiveMaxValueRunner {
    public static void main(final String[] args) {
        final int[] array = {
                1, 22, 13, 5, 66, 12, 33, -1
        };

        final int maxValue = findMaxValue(array);
        System.out.println("maxValue = " + maxValue);
    }

    private static int findMaxValue(final int[] array) {
        if (array.length == 2) {
            return Math.max(array[0], array[1]);
        }

        final int subMax = findMaxValue(Arrays.copyOfRange(array, 1, array.length));
        return Math.max(array[0], subMax);
    }
}
