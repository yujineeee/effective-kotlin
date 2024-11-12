package com.study.chapter01.item08

import com.study.chapter01.item01.e_hideMutable.User

//오류를 강제로 발생시킬때는 아래 메서드 활용
/*
fun process(user: User) {
    requireNotNull(user.name)
    val context = checkNotNull(context)
    val networkService =
        getNetworkService(context) ?: throw NoInternetConnection()
    networkService.getData{data, userData -> show(data!!, userData!!)}
}

 */