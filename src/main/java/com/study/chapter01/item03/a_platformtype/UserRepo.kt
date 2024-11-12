package com.study.chapter01.item03.a_platformtype

interface UserRepo {
    fun getUserName() = JavaClass().value
    //메서드의 inferred 타입이 플랫폼 타입
}