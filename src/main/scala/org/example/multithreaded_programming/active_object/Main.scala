package org.example.multithreaded_programming.active_object

object Main {
  def main(args: Array[String]): Unit = {

    val activeObject: ActiveObject = new ActiveObjectIml

    // Добавляем задачи в очередь
    activeObject.printMessage("Hello")
    activeObject.printMessage("World")

    println("Main thread continues...")

    // Даем время для выполнения задач
    Thread.sleep(500)

    // Останавливаем активный объект
    activeObject.stop()

    // Даем время для завершения планировщика
    Thread.sleep(500)

  }

}
