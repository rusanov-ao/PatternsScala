package org.example.structural.flyweight

class Car(model: CarModel, color: String, year: Int) {

  def fullDisplayInfo(): Unit = {
    model.displayInfo()
    println("Цвет " + color + ", год выпуска: " + year)
  }

}
