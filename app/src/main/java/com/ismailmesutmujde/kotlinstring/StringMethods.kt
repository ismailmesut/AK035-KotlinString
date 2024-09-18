package com.ismailmesutmujde.kotlinstring

import java.util.Locale

fun main() {
    val str1 = "Hello" // H-0, e-1, l-2, l-3, o-4
    println(str1.subSequence(0,3))

    val str2 = "Hello"
    if (str2.contains("el")) {
        println("It contains")
    }

    val str3 = "Hello Kotlin"
    println(str3.uppercase())
    println(str3.lowercase())

    val str4 = "Hello How Are You"
    val array = str4.split(" ")
    for (a in array) {
        println(a)
    }

    val str5 = " Hello World "
    println(str5.trim())
}