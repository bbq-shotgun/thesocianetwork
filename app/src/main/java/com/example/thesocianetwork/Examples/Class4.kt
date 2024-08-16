package com.example.thesocianetwork.Examples

fun main5(){
    /* milkshake("Banana")
    milkshake("Strawberry")
    sandwich("Chicken")
    sandwich("Ham") */
    println("Welcome to Wendy's")
    println("Do you want a milkshake?")
    var answer = readLine()
    if (answer == "Yes" || answer == "yes"){
        println("What flavor?")
        val fruit = readLine()
        milkshake(fruit!!)
    }
    println("Do you want a sandwich?")
    answer = readLine()
    if (answer == "Yes" || answer == "yes" || answer == "YES"){
        println("What protein?")
        val protein = readLine()
        sandwich(protein!!)
    }
}

fun milkshake(fruit: String) {
    println("Starting a Milkshake")
    println("Your $fruit milkshake is done.")
    println("--------------------")
}

fun sandwich(protein: String){
    println("Starting your sandwich")
    println("Your $protein sandwich is done.")
    println("--------------------")
}