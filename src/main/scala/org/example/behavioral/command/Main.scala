package org.example.behavioral.command

object Main {
  def main(args: Array[String]): Unit = {

    val car = new Car
    val startCar = new StartCar(car)
    val stopCar = new StopCar(car)

    val carInvoike = new CarInvoike(startCar)

    carInvoike.execute()
  }

}
