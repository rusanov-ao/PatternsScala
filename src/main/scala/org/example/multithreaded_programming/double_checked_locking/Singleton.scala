package org.example.multithreaded_programming.double_checked_locking

class Singleton private() {


}

object Singleton {
  @volatile private var instance: Singleton = _

  def getInstance: Singleton = {
    // Первая проверка без синхронизации
    if (instance == null) {
      // Синхронизированный блок
      this.synchronized {
        if (instance == null) {
          instance = new Singleton
        }
      }
    }
    instance
  }
}
