package com.example.thesocianetwork.Examples

open class ElectronicDevice(
    var brand: Brand = Brand.Unknown,
    var model: String = "",
    open val width: Float,
    open val height: Float,
    var color: Color = Color.Black
    ){
    override fun toString(): String{
        return "Brand: $brand, Height: $height, Width: $width, Model: $model, Color: $color"
    }
}

data class MobileDevice(
    val numberOfCameras: Int,
    val battery: Int,
    override var width: Float = 0F,
    override val height: Float
): ElectronicDevice(width = width, height = height){
    override fun toString(): String{
        return super.toString() + ", Number of Cameras: $numberOfCameras, Battery: $battery"
        }
}

fun main() {
    val iPhone = MobileDevice(numberOfCameras = 3, battery = 100, height = 120F)
    iPhone.brand = Brand.Apple
    iPhone.model = "iPhone 15 Pro Max"
    iPhone.color = Color.Purple
    iPhone.width = 120F

    println(iPhone)

    }
