package com.study.chapter01.item07

import com.study.chapter01.item05.e_nullability.Person

//NOTE null로 처리하는 법
inline fun <reified T> String.readObjectOrNull() : T? {
    //어우 동작하게는 못짜겠다..
    if (incorrectSign) {
        return null
    }

    //
    return result
}


//NOTE sealedClass로 처리하는 법
inline fun <reified T> String.readObject() : T {
    //어우 동작하게는 못짜겠다..
    if (incorrectSign) {
        return Failure(JsonParsingException())
    }

    //
    return Success(result)
}

sealed class Result<out T>
class Success<out T>(val result: T): Result<T>()
class Failure(val throwable: Throwable): Result<Nothing>()

class JsonParsingException: Exception()


fun main() {
    val something = "text"
    val person = something.readObjectOrNull<Person>()
    val age = when(person) {
        is Success -> person.age
        is Failure -> -1
    }
    //

}