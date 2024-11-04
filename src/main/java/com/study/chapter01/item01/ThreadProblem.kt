package com.study.chapter01.item01

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun multiThread() {
    println("멀티 쓰레드 이슈")
    var num = 0
    for (i in 1..1000) {
        thread {
            Thread.sleep(10)
            num += 1
        }
    }
    Thread.sleep(1000)
    println(num)
}

suspend fun coroutineButStillHasProblems() {
    println("코루틴으로 바꿔도 이슈가 있음")
    var num = 0
    coroutineScope {
        for (i in 1..1000) {
            launch {
                delay(10)
                num += 1
            }
        }
    }
    println(num)
}

fun threadWithSynchronized() {
    println("동기화 코드와 함께 구현")
    val lock = Any()
    var num = 0
    for (i in 1..1000) {
        thread {
            Thread.sleep(10)
            synchronized(lock) {
                num += 1
            }
        }
    }
    Thread.sleep(1000)
    println(num)
}

suspend fun main() {
    multiThread()
    coroutineButStillHasProblems()
    threadWithSynchronized()
}




