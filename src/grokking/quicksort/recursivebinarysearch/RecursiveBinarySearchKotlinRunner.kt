package grokking.quicksort.recursivebinarysearch

fun main() {
    val array = intArrayOf(1, 2, 4, 8, 16, 32, 64, 128)
    print(recursiveBinarySearch(array, 0, array.size, 64))
}

fun recursiveBinarySearch(array: IntArray, start: Int, end: Int, key: Int): Int {
    if (start < end) {
        val mid = start + (end - start) / 2
        return when {
            (key < array[mid]) -> {
                recursiveBinarySearch(array, start, mid, key)
            }
            (key > array[mid]) -> {
                recursiveBinarySearch(array, mid + 1, end, key)
            }
            else -> {
                mid
            }
        }
    }
    return -(start + 1)
}
