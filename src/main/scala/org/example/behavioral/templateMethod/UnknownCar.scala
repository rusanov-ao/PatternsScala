package org.example.behavioral.templateMethod

class UnknownCar extends Car {
  override def startEngine(): Unit = {
    println("Start unknown engine")
  }

  override def stopEngine(): Unit = {
    println("Stop unknown engine")
  }
}
