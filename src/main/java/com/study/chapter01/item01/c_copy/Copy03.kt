package com.study.chapter01.item01.c_copy

data class User03(
    val name: String,
    val surName: String,
)

fun main() {
    //NOTE: 만들기 귀찮으니까, data클래스의 copy를 이용해보자!
    var user = User03("Maja", "sjdflkadsjdf")
    println("${user.name} ${user.surName}")
    user = user.copy(surName = "바꿔버려")
    println("${user.name} ${user.surName}")
}



