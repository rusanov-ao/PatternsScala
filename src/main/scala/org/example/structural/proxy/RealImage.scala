package org.example.structural.proxy

class RealImage(file: String) extends Image {

  load(file)

  override def display(): Unit = {
    println("Просмотр " + file)
  }

  def load(file: String): Unit = {
    println("Загрузка " + file)
  }
}
