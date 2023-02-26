package chapter8

open class Vehicle {
    var currentSpeed = 0

    fun start() {
        println("I'm moving")
    }

    fun stop() {
        println("Stopped")
    }
}

open class FlyingVehicle : Vehicle() {
    fun takeOff() {
        println("Taking off")
    }

    fun land() {
        println("Landed")
    }
}

class Aircraft(val seats: Int) : FlyingVehicle()

fun main() {
    val aircraft = Aircraft(10)
    aircraft.takeOff()
}

