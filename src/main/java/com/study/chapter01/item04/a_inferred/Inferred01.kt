package com.study.chapter01.item04.a_inferred

open class Animal
class Zebra : Animal()

fun main() {
    //오류 Type mismatch
    //    var animal = Zebra()
    //    animal = Animal()

    var animal: Animal = Zebra()
    animal = Animal()
}