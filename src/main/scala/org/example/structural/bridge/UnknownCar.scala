package org.example.structural.bridge

class UnknownCar(engine: Engine) extends Car(engine) {
  override def setEngine(): Unit = {
    print("UnknownCar engine: ")
    engine.setEngine()
  }
}
