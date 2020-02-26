package grokking.recursion

fun main() {
    print(factorial(5))
}

fun factorial(i: Int): Int {
    if (i == 1) {
        return 1
    }
    return i * factorial(i - 1)
}
