package com.tasks

fun main(args: Array<String>) {
    val res = add(5, 10)
    println("5 + 10 = $res")
// val - это аналогия final переменных в Java.
    val minus = subtract(10, 5)
    println("10 - 5 = $minus")
}
fun add(first: Int, second: Int): Int {
    return first + second
}

fun subtract(first: Int, second: Int): Int {
    return first - second
}

