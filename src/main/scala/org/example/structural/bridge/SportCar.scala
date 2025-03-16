package org.example.structural.bridge

class SportCar(engine: Engine) extends Car(engine) {

  override def setEngine(): Unit = {
    print("SportCar engine: ")
    engine.setEngine()
  }
}
