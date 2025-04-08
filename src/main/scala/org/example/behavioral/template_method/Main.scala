package org.example.behavioral.template_method

object Main {
  def main(args: Array[String]): Unit = {

    val sportCar: Car = new SportCar

    val unknownCar: Car = new UnknownCar

    sportCar.startEngine()

    unknownCar.stopEngine()
  }

}
