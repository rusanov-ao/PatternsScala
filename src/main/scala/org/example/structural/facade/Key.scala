package org.example.structural.facade

class Key extends Car {

  override def start(): Unit = {
    println("Вставить ключ")
  }

  override def stop(): Unit = {
    println("Вынуть ключ")
  }
}
