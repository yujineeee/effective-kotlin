package com.study.chapter01.item08

fun largestOf(vararg nums:Int): Int = nums.max()!!

fun main() {
    val test = largestOf(11,2,4,5)
    println(test)
    largestOf() //NPE
}