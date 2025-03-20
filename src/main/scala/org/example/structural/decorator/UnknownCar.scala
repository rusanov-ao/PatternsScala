package org.example.structural.decorator

class UnknownCar extends Car {
  override def draw(): Unit = {
    println("UnknownCar")
  }
}
