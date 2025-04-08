package org.example.multithreaded_programming.active_object

import java.util.concurrent.{BlockingQueue, LinkedBlockingQueue}


class ActiveObjectIml extends ActiveObject {
  private val queue: BlockingQueue[Runnable] = new LinkedBlockingQueue
  @volatile private var isRunning: Boolean = true // Флаг для управления потоком

  // Запускаем планировщик в конструкторе
  new Thread(() => this.run()).start()


  private def run(): Unit = {
    while (isRunning || !queue.isEmpty) {
      try {
        val runnable: Runnable = queue.poll()
        if (runnable != null) {
          runnable.run()
        }
      } catch {
        case _: InterruptedException => Thread.currentThread().interrupt()
      }
    }
    println("Scheduler stopped.")
  }


  override def printMessage(message: String): Unit = {
    if (isRunning) {
      queue.add(() => println("Printing: " + message))
    }
  }


  override def stop(): Unit = {
    isRunning = false // Останавливаем планировщик
    queue.clear() // Очищаем очередь
  }
}
