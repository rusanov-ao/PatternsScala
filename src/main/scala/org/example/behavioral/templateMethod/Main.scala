package org.example.behavioral.templateMethod

object Main {
  def main(args: Array[String]): Unit = {

    val sportCar: Car = new SportCar

    val unknownCar: Car = new UnknownCar

    sportCar.startEngine()

    unknownCar.stopEngine()
  }

}
