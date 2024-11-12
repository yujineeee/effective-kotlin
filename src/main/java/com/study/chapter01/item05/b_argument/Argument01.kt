package com.study.chapter01.item05.b_argument

fun factorial(n: Int): Long {
    require(n >= 0)
    return if (n <= 1) 1 else factorial(n - 1) * n
}

fun factorialWithMessage(n: Int): Long {
    require(n >= 0) {"$n 값은 0보다 작아서 factorial 계산 못함못함요"}
    return if (n <= 1) 1 else factorial(n - 1) * n
}


fun main() {
    val value = factorial(2)
    println("정상이란다 $value")
//    val value2 = factorial(-1)
//    println("안된단다 $value2")

    val value3 = factorialWithMessage(2)
    println("정상이란다 $value3")
    val value4 = factorialWithMessage(-1)
    println("안된단다 $value4")
}