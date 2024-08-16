package com.example.thesocianetwork.Examples

data class Phone(
    val width: Float,
    val height: Float,
    val brand: String,
    val model: String,
    val color: String,
    val numberOfCameras: Int,

    var battery: Int,
    var signalStrength: Int,
){
    fun call(phone: String){
        println("The phone $brand - $model is calling the number $phone.")
    }
    override fun toString(): String{
        return "Brand: $brand \nModel: $model \nColor: $color\n============\n"
    }
}

fun main(){
    val iPhone15 = Phone(
        140F,
        180F,
        "Apple",
        "iPhone 15 Pro Max",
        "Black",
        4,
        100,
        80
    )
    iPhone15.call("111111-111-1111")
    iPhone15.call("55555-555-55555")

    val samsungS23 = Phone(
        160F,
        190F,
        "Samsung",
        "Galaxy S24 Ultra",
        "Black",
        5,
        99,
        92

    )
    println(samsungS23.toString())
}