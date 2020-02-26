package grokking.quicksort.sumloop;

public class SumLoopRunner {
    public static void main(final String[] args) {
//        final int[] array = {2, 4, 6};
//        final int[] array = {};
        final int[] array = {2};

        System.out.println(sum(array));
    }

    private static int sum(final int[] array) {
        int result = 0;

        for (final int step : array) {
            result += step;
        }

        return result;
    }
}
