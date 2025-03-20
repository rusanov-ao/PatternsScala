package org.example.structural.decorator

object Main {
  def main(args: Array[String]): Unit = {

    val sportCar: Car = new RedCarDecorator(new SportCar)

    sportCar.draw()
  }

}
