package org.example.multithreaded_programming.lock

class Worker(counter: Counter) extends Runnable {

  override def run(): Unit = {
    for (i <- 0 until 1000) {
      counter.increment()
    }
  }
}
