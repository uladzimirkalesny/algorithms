package grokking.quicksort.sumloop

fun main() {
    val array = intArrayOf(2, 4, 6)
    val array2 = intArrayOf()
    val array3 = intArrayOf(2)

    println(sumPretty(array))
    println(sumPretty(array2))
    println(sumPretty(array3))
}

fun sumPretty(array: IntArray): Int {
    var result = 0;

    for (i in array.indices) {
        result += array[i];
    }

    return result;
}