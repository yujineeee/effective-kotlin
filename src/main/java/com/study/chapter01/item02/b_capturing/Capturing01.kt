package com.study.chapter01.item02.b_capturing

fun getPrimeV1() {
    var numbers = (2..100).toList()
    val primes = mutableListOf<Int>()
    while (numbers.isNotEmpty()) {
        val prime = numbers.first()
        primes.add(prime)
        numbers = numbers.filter { it % prime != 0 } //자기자신으로 날라가는건 제거해버리깅
    }
    println("getPrimeV1: $primes")
}

fun getPrimeWithSequence(sequence: Int) {
    val primes: Sequence<Int> = sequence {
        var numbers = generateSequence(2) { it + 1 }

        while (true) {
            val prime = numbers.first()
            yield(prime)
            numbers = numbers.drop(1).filter { it % prime != 0 }
        }
    }

    println("getPrimeWithSequence: ${primes.take(sequence).toList()}")
}

fun getPrimeWithSequenceButWrong(sequence: Int) {
    val primes: Sequence<Int> = sequence {
        var numbers = generateSequence(2) { it + 1 }

        var prime:Int // 위의 코드와 다른점(=반복문 진입 전, 한번만 생성하려고함)
        while (true) {
            prime = numbers.first()
            yield(prime)
            numbers = numbers.drop(1).filter { it % prime != 0 }
        }
    }

    println("getPrimeWithSequence: ${primes.take(sequence).toList()}")
    //prime이라는 변수를 캡쳐했기 때문에 이상한 결과가 나옴
    //시퀀스를 활용하므로 필터링이 지연됨(prime이 2일때, 필터링된 4를 제외하면 drop만 동작하여 연속된 숫자가 나옴)
}

fun main() {
    getPrimeV1()
    getPrimeWithSequence(25)
    getPrimeWithSequenceButWrong(25) //잘못된 결과