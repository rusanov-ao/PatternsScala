package org.example.generative.factory

class WindowsOS extends OS {
  override def getOS(): Unit = {
    println("Запуск на Windows")
  }
}
