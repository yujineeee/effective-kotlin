package com.study.chapter01.item09

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun countCharactersInFile(path: String): Int {
    val reader = BufferedReader(FileReader(path))
    reader.use {
        return reader.lineSequence().sumBy { it.length }
    }
}

fun countCharactersInFileWithLambda(path: String): Int {
    BufferedReader(FileReader(path)).use { reader ->
        return reader.lineSequence().sumBy { it.length }
    }
}

fun countCharactersInFileLines(path: String): Int {
    return File(path).useLines { lines -> lines.sumBy { it.length } }
}
