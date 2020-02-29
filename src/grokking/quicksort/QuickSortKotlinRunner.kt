package grokking.quicksort

fun main() {
    val array = intArrayOf(
            1, 4, 3, 2, 6, 10, 8, 9, 7
    )
    val lowIndex = 0
    val highIndex = array.size - 1
    quickSort(array, lowIndex, highIndex)
    println(array.contentToString())
}

private fun quickSort(array: IntArray, lowIndex: Int, highIndex: Int) {
    val middle = lowIndex + (highIndex - lowIndex) / 2
    val pivot = array[middle]

    var i = lowIndex
    var j = highIndex

    while (i <= j) {
        while (array[i] < pivot) {
            i++
        }

        while (array[j] > pivot) {
            j--
        }

        if (i <= j) {
            val temp = array[i]
            array[i] = array[j]
            array[j] = temp
            i++
            j--
        }
    }

    if (lowIndex < j) {
        quickSort(array, lowIndex, j)
    }

    if (highIndex > i) {
        quickSort(array, i, highIndex)
    }
}
