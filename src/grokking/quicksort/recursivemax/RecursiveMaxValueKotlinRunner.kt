package grokking.quicksort.recursivemax

import kotlin.math.max

fun main() {
    println(findMaxValue(intArrayOf(1, 22, 13, 5, 66, 12, 33, -1)))
}

fun findMaxValue(array: IntArray): Int {
    if (array.size == 2) {
        return max(array[0], array[1])
    }

    val subMax = findMaxValue(array.copyOfRange(1, array.size))
    return max(array[0], subMax)
}