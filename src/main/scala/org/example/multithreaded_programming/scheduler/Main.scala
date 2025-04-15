package org.example.multithreaded_programming.scheduler

import java.util.concurrent.TimeUnit

object Main {
  def main(args: Array[String]): Unit = {

    // Создаем планировщик
    val scheduler: Scheduler = new Scheduler(1)

    // Создаем задачи
    val task1: Task = new PrintTask("Task1")
    val task2: Task = new PrintTask("Task2")

    scheduler.scheduleAtFixedRate(task1, 0, 2, TimeUnit.SECONDS) // Каждые 2 секунды
    scheduler.scheduleAtFixedRate(task2, 5, 3, TimeUnit.SECONDS) // Каждые 3 секунды, начиная через 5 секунд

    // Останавливаем планировщик через 20 секунд
    new Thread(() => {
      try {
        Thread.sleep(20000)
      } catch {
        case e: InterruptedException => e.printStackTrace()
      }
      println("Shutting down scheduler...")
      scheduler.shutdown()
    }).start()



  }

}
