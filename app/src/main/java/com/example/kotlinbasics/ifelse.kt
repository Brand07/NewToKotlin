package com.example.kotlinbasics

fun main() {
    var age = 0
    println("Please enter your age as a full number:")
    val enteredValue = readln()
    age = enteredValue.toInt()

    if (age >= 18 && age <40){
        println("You're old enough to to enter.")
    }else if (age > 40){
        println("You're too old.")
    }else{
        println("You're too young")
    }
}