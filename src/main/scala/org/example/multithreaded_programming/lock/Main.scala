package org.example.multithreaded_programming.lock

object Main {
  def main(args: Array[String]): Unit = {
    val counter: Counter = new Counter

    // Создаем 2 потока
    val thread1: Thread = new Thread(new Worker(counter))
    val thread2: Thread = new Thread(new Worker(counter))

    // Запускаем 2 потока
    thread1.start()
    thread2.start()

    // Ждем завершеня потоков
    thread1.join()
    thread2.join()

    println("Final count: " + counter.getCount)
  }

}
