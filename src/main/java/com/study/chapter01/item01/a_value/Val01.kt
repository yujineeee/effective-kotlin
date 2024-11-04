package com.study.chapter01.item01.a_value


//val a = 10
//a = 20
fun valMutableTest() {
    val list = mutableListOf(1,2,3)
    list.add(4)

    println(list)
}

fun main() {
    //val 예제 1
    println("읽기 전용 프로퍼티는 완전히 변경 불가능한 것이 아님 (mutable 객체를 담고 있으면, 내부적으로 변할 수 있음)")
    valMutableTest()
}



