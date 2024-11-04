package com.study.chapter01.item01.c_copy

import java.util.*

class FullName(
    var name: String,
    val surName: String,
) : Comparable<FullName> {
    //NOTE: 결과 만들라구 이렇게 했는데 맞는감
    override fun compareTo(other: FullName): Int = name.compareTo(other.name)
}


fun main() {
    val names: SortedSet<FullName> = TreeSet()
    val person = FullName("AAA", "AAA")
    names.add(person)
    names.add(FullName("Jordan", "Hansen"))
    names.add(FullName("David", "Blanc"))

    println(names)
    println(person in names) //true

    person.name = "ZZZ"
    println(names)
    println(person in names) //false
}



