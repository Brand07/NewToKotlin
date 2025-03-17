package com.example.kotlinbasics

fun main(){
    var age = 0
    println("Please enter your age as a full number:")
    val enteredValue = readln()
    age = enteredValue.toInt()


    if(age >= 21){
        //Execute this
        println("Old enough")
    }else{
        //if not true, execute this
        println("Not old enough")
    }
}