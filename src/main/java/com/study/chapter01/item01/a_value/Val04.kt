package com.study.chapter01.item01.a_value


val val04Name: String? = "마튼"
val val04SurName: String? = "브라운"
val val04FullName: String?
    get() = val04Name?.let { "$it $val04SurName" }
val val04FullName2: String? = val04Name?.let { "$it $val04SurName" }


fun main() {
    //val 예제 4 - 스마트 캐스팅

    if (val04FullName != null) {
        //NOTE: 게터로 정의했으므로 스마트 캐스트할 수 없음
        // println(val04FullName.length)
    }

    if (val04FullName2 != null) {
        //NOTE: 프로퍼티가 final이고 사용자 정의 게터를 갖지 않을 경우에만 스마트 캐스트 가능
        println(val04FullName2.length)
    }
}

