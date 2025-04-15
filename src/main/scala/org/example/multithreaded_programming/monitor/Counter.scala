package org.example.multithreaded_programming.monitor

class Counter {
  private var count: Int = 0

  // Синхронизированный метод для увеличения счетчика
  def increment(): Unit = this.synchronized {
    count += 1
  }

  // Синхронизированный метод для получения значения счетчика
  def getCount(): Int = this.synchronized {
    count
  }

}
