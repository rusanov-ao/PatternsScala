package org.example.multithreaded_programming.double_checked_locking

object Main {
  def main(args: Array[String]): Unit = {

    val task: Runnable = () => {
      val singleton = Singleton.getInstance
      println(s"Instance hash code: ${singleton.hashCode()}")
    }

    val thread1: Thread = new Thread(task)
    val thread2: Thread = new Thread(task)

    thread1.start()
    thread2.start()

  }

}
