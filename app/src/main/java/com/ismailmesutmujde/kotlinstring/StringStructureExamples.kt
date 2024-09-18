package com.ismailmesutmujde.kotlinstring

fun main() {

    val str1 = "Hello"
    println(str1)

    var str2 = String()
    str2 = "Kotlin"
    println(str2)

    val str3 = """
        HOW ARE YOU?
        HELLO
        HEY!
    """.trimIndent()
    println(str3)

    val str4 = "s"
    var str5 = String()
    str5 = "x"

    if(str4.isEmpty()) {
        println("str4 is empty")
    } else {
        println("str4 is not empty")
    }

    if(str5.isEmpty()) {
        println("str5 is empty")
    } else {
        println("str5 is not empty")
    }

    val varA = 10
    val varB = 20

    println("$varA x $varB = ${varA*varB}")

    val str6 = "Hello"
    val str7 = " World"
    println(str6+str7)

    val str8 = "Hello,Kotlin !"
    println("$str8 size : ${str8.length}")

    val str9 = "Hello"
    val str10 = "Hello World"

    if (str9 == str10) {
        println("$str9 and $str10 are equal")
    } else {
        println("$str9 and $str10 are not equal")
    }

    val str11 = "Hello Kotlin"
    for (s in str11) {
        println(s)
    }
}