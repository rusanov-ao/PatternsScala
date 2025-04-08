package org.example.behavioral.template_method

class SportCar extends Car {
  override def startEngine(): Unit = {
    println("Start sport engine")
  }

  override def stopEngine(): Unit = {
    println("Stop sport engine")
  }
}
