package org.example.behavioral.templateMethod

class SportCar extends Car {
  override def startEngine(): Unit = {
    println("Start sport engine")
  }

  override def stopEngine(): Unit = {
    println("Stop sport engine")
  }
}
