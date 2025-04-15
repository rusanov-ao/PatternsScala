package org.example.multithreaded_programming.monitor

object Main {
  def main(args: Array[String]): Unit = {

    val counter: Counter = new Counter

    val thread1: Thread = new Thread(() => {
      for (i <- 0 until 10000) {
        counter.increment()
      }
    })

    val thread2: Thread = new Thread(() => {
      for (i <- 0 until 10000) {
        counter.increment()
      }
    })


    thread1.start()
    thread2.start()

    thread1.join()
    thread2.join()


    println(counter.getCount())

  }

}
