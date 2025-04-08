package org.example.behavioral.template_method

class UnknownCar extends Car {
  override def startEngine(): Unit = {
    println("Start unknown engine")
  }

  override def stopEngine(): Unit = {
    println("Stop unknown engine")
  }
}
