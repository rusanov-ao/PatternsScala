package org.example.multithreaded_programming.active_object

trait ActiveObject {

  def printMessage(message: String): Unit
  def stop(): Unit // Метод для остановки планировщика

}
