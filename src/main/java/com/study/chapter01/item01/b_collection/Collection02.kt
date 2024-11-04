package com.study.chapter01.item01.b_collection

fun dontDoThis() {
    val list = listOf(1, 2, 3)

    if (list is MutableList) {
        list.add(4)
    }
}

fun doThis() {
    val list = listOf(1, 2, 3)
    val mutableList = list.toMutableList()
    mutableList.add(4)
}

fun main() {
    //가변 컬렉션과 읽기 전용 컬렉션 구분하기
    println("컬렉션 다운 캐스팅 하지 마세요 - 에러남")
    dontDoThis()

    //읽기 전용에서 Mutable로 변경하고 싶으면?
    println("읽기 전용에서 Mutable로 변경하고 싶으면? > 복제를 통해서 새로운 mutable 컬렉션 만들기")
    doThis()
}



