package com.example.thesocianetwork.Examples

open class GamingDevice(
        open var manufacturer: String = "",
        open var model: String = "",
        ){
        override fun toString(): String{
            return ": Manufacturer: $manufacturer, Model: $model"
        }
}

open class GamingConsole(
        open val resolution: String = "",
        open var fps: Int? = 0
): GamingDevice(){
        override fun toString(): String{
            return super.toString() + ", Resolution: $resolution, FPS: $fps"
        }
        fun getList(): List<Int>{
                return listOf(
                        "1", "2", "3", "4", "5"
                ).map {num-> num.toInt() }
        }

        override var model: String
                get() = super.model
                set(value) {}
}

data class GamingMobileConsole(
    val internetConnection: Int? = 0,
    val battery: Float? = 0F,
    val gamingConsole: GamingConsole,
    val gamingDevice: GamingDevice
        )

fun main(){
       println("What's your manufacturer? \n")
        val manTemp  = readLine() ?: ""
        println ("What's your model? \n")
        val modTemp = readLine() ?: ""
        println("What's your resolution? \n")
        val resTemp = readLine() ?: ""
        println("How many FPS? \n")
        val fpsTemp = readLine()?.toInt()
        println("What's your internet connection? \n")
        val intTemp = readLine()?.toInt()
        println("What's your battery? \n")
        val batTemp = readLine()?.toFloat()

        val pepito = GamingMobileConsole(
                internetConnection = intTemp,
                battery = batTemp,
                gamingConsole = GamingConsole(resTemp, fpsTemp),
                gamingDevice = GamingDevice(manTemp, modTemp)
        )

        println(pepito)
}