package com.study.chapter01.item06

inline fun <reified T> String.readObject() : T {
    //어우 동작하게는 못짜겠다..
    if (incorrectSign) {
        throw JsonParsingException()
    }

    //
    return result
}