package org.example.structural.facade

class Facade {


  val key = new Key()
  val engine = new Engine()


  def startCar(): Unit = {
    key.start()
    engine.start()
  }

  def stopCar(): Unit = {
    key.stop()
    engine.stop()
  }

}
