package org.example.facade

object Main {

  def main(args: Array[String]): Unit = {

    val car: Facade = new Facade()

    car.startCar()
    car.stopCar()
  }

}
