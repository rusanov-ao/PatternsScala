package org.example.generative.builder

object Main {
  def main(args: Array[String]): Unit = {


  val sportCar = Car.builder().
    setDoors(2).
    setTires(19).
    setColor("red").
    setHasNavigator(false).
    setInsurancePolice("Asd")

    println(sportCar)

  }

}
