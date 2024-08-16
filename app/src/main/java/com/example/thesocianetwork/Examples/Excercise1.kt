package com.example.thesocianetwork.Examples

data class Computer(
    val width: Float,
    val height: Float,
    val depth: Float,
    val cpu: String,
    val ram: String,
    val gpu: String,
    val storage: String,
    val game: String,

    var internetConnection: Int,
    var wifiStatus: Int,
){
    fun gaming(computer: String){
        println("PC with is using the $cpu, $ram, $gpu with your storage $storage for playing $game")
    }
    fun browsing(computer: String){
        println("You are using $internetConnection% of your internet connection.")
    }
}
