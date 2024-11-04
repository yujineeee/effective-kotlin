package com.study.chapter01.item01.d_mutatingPoint

import kotlin.concurrent.thread
import kotlin.properties.Delegates


fun mutatingPoint01() {
    val list1: MutableList<Int> = mutableListOf()
    var list2: List<Int> = listOf()

    list1.add(1)
    list2 = list2 + 1

    list1 += 1
    list2 += 1

    println(list1)
    println(list2)
}

fun mutatingPoint02() {
    var listThread = listOf<Int>()
    for (i in 1..1000) {
        thread {
            listThread = listThread + i
        }
    }
    Thread.sleep(1000)
    print(listThread.size)
}

fun mutatingPoint03() {
    var names by Delegates.observable(listOf<String>()) { _, old, new -> println("이름 변경 $old to $new") }

    names += "Fabio"
    names += "Bill"
}

fun main() {
    mutatingPoint01()
    //NOTE: 1000이 되지 않음
    mutatingPoint02()

    //NOTE: 리스트에 변경이 있을때 로그 출력
    mutatingPoint03()
}