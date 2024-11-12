import com.study.chapter01.item01.e_hideMutable.User

val a = 1
fun fizz() {
    val b = 2
    println(a + b)
}

fun main() {

    fizz()

    val users = listOf(User("a"), User("b"), User("c"))

    //나쁜 예
    var user: User
    for (i in users.indices) {
        user = users[i]
        println("User at $i is $user")
    }

    //조금 더 좋은 예
    for (i in users.indices) {
        val betterUser = users[i]
        println("User at $i is $betterUser")
    }

    //제일 좋은 예
    for ((i, bestUser) in users.withIndex()) {
        println("User at $i is $bestUser")
    }
}
