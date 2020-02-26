package grokking.quicksort.recursivesum;

public class RecursionSumLoopRunner {
    public static void main(final String[] args) {
        final int[] test = {2, 4, 6};
//        final int[] test = {};
//        final int[] test = {2};

        final int value = sum(test);
        System.out.println(value);
    }

    private static int sum(final int[] array) {
        int result = 0;

        if (array.length == 1) {
            return array[0];
        }

        if (array.length > 1) {
            int[] temp = new int[array.length - 1];
            int counter = 0;

            result = array[counter++];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = array[counter++];
            }
            return result + sum(temp);
        }

        return result;
    }
}
