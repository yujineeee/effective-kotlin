package com.study.chapter01.item01.c_copy

class User(
    val name: String,
    val surName: String,
) {
    fun withSurName(surName: String) = User(name, surName)
}


fun main() {
    //NOTE: 메서드를 제공해서, 자신을 수정한 새로운 객체를 만들어낼 수 있게 해야함
    var user = User("Maja", "sjdflkadsjdf")
    println("${user.name} ${user.surName}")
    user = user.withSurName("바꿔버려")
    println("${user.name} ${user.surName}")
}



