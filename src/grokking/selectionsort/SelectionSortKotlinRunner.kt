@file:Suppress("NAME_SHADOWING")

package grokking.selectionsort

fun selectionSort(array: IntArray): IntArray? {
    var array = array
    val resultArray = IntArray(array.size)
    for (i in resultArray.indices) {
        val smallValueIndex = findSmallValueIndex(array)
        resultArray[i] = array[smallValueIndex]
        array = decreaseArray(array, smallValueIndex)
    }
    return resultArray
}

fun decreaseArray(array: IntArray, smallValueIndex: Int): IntArray {
    val temp = IntArray(array.size - 1)
    for (i in array.indices) {
        if (i < smallValueIndex) {
            temp[i] = array[i]
        } else if (i > smallValueIndex) {
            temp[i - 1] = array[i]
        }
    }
    return temp
}

fun findSmallValueIndex(array: IntArray): Int {
    var smallValue = array[0]
    var smallValueIndex = 0
    for (i in 1 until array.size) {
        if (array[i] < smallValue) {
            smallValue = array[i]
            smallValueIndex = i
        }
    }
    return smallValueIndex
}

fun main() {
    val array = intArrayOf(
            19, 2, 3, 4, 5, 499999999, 11, 9, 8, 6, 1
    )

    val sortedArray = selectionSort(array)
    println(sortedArray?.contentToString())
}