package com.study.chapter01.item05.e_nullability

fun sendMail(person: Person, text: String) {
    requireNotNull(person.email)
    println("메일 보내요.. ${person.email}, $text")
}


fun sendMailV2(person: Person, text: String) {
    //얼리 리턴
    val email: String = person.email ?: return
    println("메일 보내요.. $email, $text")
}

fun main() {
    sendMail(Person(Outfit.PAJAMA, "email@g.com"), "안녕하세요")
    sendMail(Person(Outfit.PAJAMA), "안녕 못해")
    sendMailV2(Person(Outfit.PAJAMA, "email@g.com"), "안녕하세요")

}