package com.study.chapter01.item05.c_check

fun speakWithMessage(text: String, isInitialized: Boolean) {
    check(isInitialized) {
        "isInitialized 안된듯요"
    }
    println(text)
}

fun main() {
    speakWithMessage("메롱1", isInitialized = true)
    speakWithMessage("메롱2", isInitialized = false)
}