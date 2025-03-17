package com.example.rockpaperscissors

fun main(){
    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper, Scissors? Enter your choice: ")
    playerChoice = readln()

    val randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        else -> {
            computerChoice = "Scissors"
        }
    }
    println(computerChoice)

    //Store the winner
    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    if(winner == "Tie"){
        println("Its a tie!")
    }else{
        println("The $winner won!")
    }

}