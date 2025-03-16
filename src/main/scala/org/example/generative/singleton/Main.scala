package org.example.generative.singleton

object Main {
  def main(args: Array[String]): Unit = {

    /**
     * В scala нельзя присвоить переменной единственный экземпляр класса Singleton.
     * Поэтому методы вызываются напрямую
     */
    Singleton.setUp()

  }
}