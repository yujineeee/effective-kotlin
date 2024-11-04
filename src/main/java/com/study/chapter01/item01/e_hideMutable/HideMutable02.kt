package com.study.chapter01.item01.e_hideMutable

class UserRepository02 {
    private val storedUsers: MutableMap<Int, String> = mutableMapOf()

    //NOTE: 업캐스트하여 가변성 제한
    fun loadAll(): Map<Int, String> {
        return storedUsers
    }
}
