package com.study.chapter01.item05.e_nullability

fun changeDress(person: Person) {
    require(person.outfit == Outfit.DRESS)
    println("드레스요")
}