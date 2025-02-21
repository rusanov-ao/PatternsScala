package org.example.factory

class MacOS extends OS {
  override def getOS(): Unit = {
    println("Запуск на Mac")
  }
}
