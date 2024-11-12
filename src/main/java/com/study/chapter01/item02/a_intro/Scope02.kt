import com.study.chapter01.item01.e_hideMutable.User

private fun getValue(): User = User("흐에에")

fun main() {
    val hasValue = true
    //나쁜 예
    val user: User
    if (hasValue) {
        user = getValue()
    } else {
        user = User("a")
    }

    //조금 더 좋은 예
    val betterUser: User = if (hasValue) {
        getValue()
    } else {
        User("a")
    }
}
