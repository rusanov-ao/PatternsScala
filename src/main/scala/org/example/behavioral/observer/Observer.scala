package org.example.behavioral.observer

import scala.collection.mutable.ArrayBuffer

// Интерфейс наблюдателя
trait Observer {

  def event(list: ArrayBuffer[String]): Unit

}
