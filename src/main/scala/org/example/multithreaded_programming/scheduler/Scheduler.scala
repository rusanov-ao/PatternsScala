package org.example.multithreaded_programming.scheduler

import java.util.concurrent.{Executors, ScheduledExecutorService, TimeUnit}

class Scheduler(poolSize: Int) {
  private val executors: ScheduledExecutorService = Executors.newScheduledThreadPool(poolSize)


  // Метод для планирования задачи с фиксированным интервалом
  def scheduleAtFixedRate(task: Task, initialDelay: Long, period: Long, unit: TimeUnit): Unit = {
    executors.scheduleAtFixedRate(() => task.execute(), initialDelay, period, unit)
  }


  // Метод для остановки планировщика
  def shutdown(): Unit = {
    executors.shutdown()
  }



}
