package com.study.chapter01.item01.b_collection

inline fun <T, R> Iterable<T>.customMap(
    transformation: (T) -> R
): List<R> {
    val list = ArrayList<R>()
    for (elem in this) {
        println("원래값: ${elem.toString()}")
        println("transformation(elem): ${transformation(elem).toString()}")
        list.add(transformation(elem))
    }
    return list
}


fun main() {
    //가변 컬렉션과 읽기 전용 컬렉션 구분하기
    println("Iterable<T>.map의 구현을 단순히 해보자면?")
    val newList = listOf(1,2,3).customMap { it + 1 }
    println(newList)

}



