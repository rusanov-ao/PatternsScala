package org.example.behavioral.observer

import scala.collection.mutable.ArrayBuffer

class University {

  // Список всех наблюдателей
  private val observers: ArrayBuffer[Observer] = new ArrayBuffer[Observer]

  // Список всех студентов
  private val students: ArrayBuffer[String] = new ArrayBuffer[String]

  // Настраиваем метод оповещения для любого наблюдателя
  def notifyObservers(): Unit = {
    for (observer: Observer <- observers) {
      observer.event(students)
    }
  }

  def addStudent(student: String): Unit = {
    students += student
    notifyObservers()
  }

  def removeStudent(student: String): Unit = {
    students -= student
    notifyObservers()
  }

  def addObserver(observer: Observer): Unit = {
    observers += observer
  }

  def removeObserver(observer: Observer): Unit = {
    observers -= observer
  }

}
