package com.study.chapter01.item01.a_value


var val02Name: String = "마친"
var val02SurName: String = "모스칼라"
val val02FullName
    get() = "$val02Name $val02SurName"


fun calculate(): Int {
    print("Calculating... ")
    return 42
}

val fizz = calculate()
val buzz get() = calculate()

fun main() {
    //val 예제 2 - 1
    println("2-1. 읽기 전용 프로퍼티는 다른 프로퍼티를 활용하는 사용자 정의 게터로도 정의할 수 있음")
    println(val02FullName)
    val02Name = "마자"
    println(val02FullName)

    //val 예제 2 - 2
    println("2-2. 읽기 전용 프로퍼티는 다른 프로퍼티를 활용하는 사용자 정의 게터로도 정의할 수 있음")
    println("값을 추출할 때마다 사용자 정의 게터 호출")
    println(fizz)
    println(fizz)
    println(buzz)
    println(buzz)
}

