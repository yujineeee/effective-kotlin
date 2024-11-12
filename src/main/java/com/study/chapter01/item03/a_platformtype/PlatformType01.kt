package com.study.chapter01.item03.a_platformtype


//코틀린 > statedType
fun statedType() {
    val value: String = JavaClass().value //여기서 NPE
    println("statedType: ${value.length}")
}

//코틀린 > platformType
fun platformType() {
    val value = JavaClass().value
    println("platformType: ${value.length}") //여기서 NPE
}

fun main() {
    statedType() //자바에서 값을 가져오는 위치에서 NPE (val value: String = JavaClass().value)
    platformType() //값을 활용할때 NPE ( println("platformType: ${value.length}"))
}