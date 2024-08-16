package com.example.thesocianetwork.Examples

enum class Brand{
    Samsung,
    Huawei,
    Apple,
    Unknown
}

enum class Color{
    Black,
    Yellow,
    Purple,
    Blue,
    Red,
    Green,
    Magenta
}

data class ElectronicDevice2(
    val brand: Brand,
    val model: String,
    val width: Float,
    val height: Float,
    val color: Color
)

fun main6(){
    val tv = ElectronicDevice2(
         brand = Brand.Samsung,
        "UHD4K",
        180F,
        120F,
        color = Color.Black
        )
    val iPhone = ElectronicDevice2(
        brand = Brand.Apple,
        "iPhone 15 Pro Max",
        12F,
        10F,
        color = Color.Red
    )
    val iPad = ElectronicDevice2(
        brand = Brand.Apple,
        "iPad Pro",
        18F,
        12F,
        color = Color.Green
    )
    println(tv)
    println(iPhone)

    if (tv.brand == iPhone.brand){
        println("Device model ${tv.model} and ${iPhone.model} are the same")
        }
        else{
            println("Devices brand aren't the same")
            }
    if (iPhone.brand == iPad.brand){
        println("Device model ${iPhone.model} and ${iPad.model} are the same brand.")
        }
    else{
        println("Devices brand aren't the same")
        }
    }