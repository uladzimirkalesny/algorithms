package grokking.quicksort.sumloop

fun main() {
    val test = intArrayOf(2, 4, 6)
    val test1 = intArrayOf()
    val test2 = intArrayOf(2)

    println(sum(test))
    println(sum(test1))
    println(sum(test2))
}

fun sum(array: IntArray): Int {
    var result = 0

    if (array.size == 1) {
        return array[0]
    }

    if (array.size > 1) {
        val temp = IntArray(array.size - 1)
        var counter = 0
        result = array[counter++]
        for (i in temp.indices) {
            temp[i] = array[counter++]
        }
        return result + sum(temp)
    }

    return result
}