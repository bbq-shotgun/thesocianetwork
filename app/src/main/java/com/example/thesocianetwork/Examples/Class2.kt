package com.example.thesocianetwork.Examples

// fun main2() {
//    println("Hello world!")
//    var size  =  10
//    println(size)
// }

/* fun main(){
    val fullName = "BBQ Shotgun"
        println(fullName)
    val birthDate = "22 de Agosto de 1989"
        println(birthDate)
    val age = 34
        println(age)
    val isProgrammer = true
        println(isProgrammer)
    val temperature: Double = 25.5
        println(temperature)
    if(isProgrammer) {
        println("You'll be rich")}
    else {
        println("You can still learn")
    }
}

 */

fun main2(){
    println("Escribe tu edad: ")
    val age = readLine()?.toInt()

    if (age != null) {
        if (age <= 25){
            println("Estás jovén")
        } else {
            println("Ya no estás para fiestas")
        }
    } else
        println("No introdujiste una edad válida.")
}