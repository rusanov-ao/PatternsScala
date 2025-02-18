package org.example.composite


object Main {

  def main(args: Array[String]): Unit = {


    val sportCar: Car = new SportCar
    val unknownCar: Car = new UnknownCar
    val draw: Draw = new Draw

    draw.add(sportCar)
    draw.add(unknownCar)
    draw.draw("green")

    draw.clear()

    draw.add(sportCar)
    draw.add(unknownCar)
    draw.draw("red")


  }
}
