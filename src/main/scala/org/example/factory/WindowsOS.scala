package org.example.factory

class WindowsOS extends OS {
  override def getOS(): Unit = {
    println("Запуск на Windows")
  }
}
