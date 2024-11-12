package com.study.chapter01.item04.a_inferred

import com.study.chapter01.item04.a_inferred.Inferred02.Companion.DEFAULT_CAR

interface CarFactory {
    fun produce() = DEFAULT_CAR
}