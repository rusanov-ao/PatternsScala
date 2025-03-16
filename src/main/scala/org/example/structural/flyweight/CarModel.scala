package org.example.structural.flyweight

case class CarModel(brand: String, model: String, enginePower: Int) {

  def displayInfo(): Unit = {
    println("Модель " + brand + " " + model + ", Мощность " + enginePower + " л.с.")
  }

}
