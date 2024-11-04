package com.study.chapter01.item01.e_hideMutable

data class User(val name:String)

class UserRepository {
    private val storedUsers: MutableMap<Int, String> = mutableMapOf()
    fun loadAll(): MutableMap<Int, String> {
        return storedUsers
    }
    fun init() {
        for(i in 1..20) {
            storedUsers.put(i, "$i")
        }
    }
}

fun main() {
    //NOTE: private 상태인 userRepository가 수정 가능하다
    val userRepository = UserRepository()
    userRepository.init()
    val storedUsers = userRepository.loadAll()
    storedUsers[4] = "Kirill"

    println(userRepository.loadAll())

    //NOTE: 해결방법 1 - 방어적 복제
}