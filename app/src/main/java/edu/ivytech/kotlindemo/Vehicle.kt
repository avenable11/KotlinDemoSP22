package edu.ivytech.kotlindemo

open class Vehicle(val numOfDoors:Int, val numOfWheels:Int = 2, var price:Double,
              val transmission:String = "Automatic", val description:String ) {
    override fun toString(): String {
        return "Description: $description\nNumber of doors: $numOfDoors" +
                "\nNumber of Wheels: $numOfWheels\nTransmission: $transmission\nPrice: $price"
    }
}

class Car(val vin : String, val trunkSpace : String, numOfDoors: Int, price: Double,
          transmission: String, description: String) :
   Vehicle(numOfDoors, 4, price, transmission, description) {
       override fun toString() : String {
           return super.toString() + "\nVIN: $vin\nTrunk space: $trunkSpace"
       }
   }


fun main(args:Array<String>) {
    val v = Vehicle(2, 4, 1299.99, "Automatic",
        "this is a vehicle")
    val c = Car("123abcd", "A lot", 4, 25999.99, "Manual", "This is a car")
    println("Enter the vehicle description: ")
    val description = readLine()
    print("Enter the number of wheels: ")
    val wheels = readLine()!!.toInt()
    println(v)
    println(c)
}