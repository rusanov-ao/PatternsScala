package org.example.structural.bridge

object Main {
  def main(args: Array[String]): Unit = {

    val sportCar: Car = new SportCar(new SportEngine)

    val unknownCar: Car = new UnknownCar(new UnknownEngine)

    sportCar.setEngine()
  }

}
