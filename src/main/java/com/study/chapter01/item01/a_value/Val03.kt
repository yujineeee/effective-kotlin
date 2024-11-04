package com.study.chapter01.item01.a_value


// val 예제 3 - val는 var로 오버라이드 할 수 있음
interface Element {
    val active: Boolean
}

class ActualElement: Element {
    override var active: Boolean = false
}



