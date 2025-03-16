package org.example.generative.factory

class MacOS extends OS {
  override def getOS(): Unit = {
    println("Запуск на Mac")
  }
}
