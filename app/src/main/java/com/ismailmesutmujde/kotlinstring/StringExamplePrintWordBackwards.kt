package com.ismailmesutmujde.kotlinstring

import java.util.Scanner

fun main() {

    val input = Scanner(System.`in`)
    println("Enter your word")
    val word = input.next()

    // ismail : i-0, s-1, m-2, a-3, i-4, l-5
    // 5,4,3,2,1,0

    for (i in word.length-1 downTo 0) {
        print(word[i])
    }
}