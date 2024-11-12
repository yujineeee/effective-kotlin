package com.study.chapter01.item04.a_inferred

class Inferred02 {
    //val DEFAULT_CAR: Car = Fiat126P() //처음에는 이렇게 해놨다가
    //누군가 요렇게 바꿨다면..
    companion object {
        val DEFAULT_CAR = Fiat126P() //CarFactory에서 Fiat126P 이외의 자동차를 못만들게 되는 현상
    }
}

fun main() {

}