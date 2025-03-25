package org.example.behavioral.observer

import scala.collection.mutable.ArrayBuffer

// Создаем класс наблюдателя
class Director extends Observer {

  override def event(list: ArrayBuffer[String]): Unit = {
    println("The list of students has changed: " + list)
  }
}
