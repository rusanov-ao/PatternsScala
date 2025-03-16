package org.example.facade

class Engine extends Car {

  override def start(): Unit = {
    println("Запустить двигатель")
  }

  override def stop(): Unit = {
    println("Остановить двигатель")
  }
}
