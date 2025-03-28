package org.example.behavioral.visitor

object Main {
  def main(args: Array[String]): Unit = {

    val sportCar: Car = new SportCar

    sportCar.accept(new CarVisitor)

  }

}
