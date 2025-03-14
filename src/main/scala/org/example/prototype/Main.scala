package org.example.prototype

object Main {
  def main(args: Array[String]): Unit = {

    val bmw = Car("BMW", "Black", 2)
    val audi = bmw.copy(model = "Audi")
    val audiFamily = audi.copy(doors = 4)

    val bmwBlack = bmw.copy()

    println(bmw)
    println(audi)
    println(audiFamily)
    println(bmwBlack)

  }
}

case class Car(model: String, color: String, doors: Int)