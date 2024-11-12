package com.study.chapter01.item03.a_platformtype

class RepoImpl: UserRepo {
    override fun getUserName(): String? {
        return null
    }
}

fun main() {
    val repo: UserRepo = RepoImpl()
    val text: String = repo.getUserName() //런타임때 NPE
    println("User name length is ${text.length}")
}