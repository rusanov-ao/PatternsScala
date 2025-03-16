package org.example.generative.factory

class LinuxOS extends OS {
  override def getOS(): Unit = {
    println("Запуск на Linux")
  }
}
