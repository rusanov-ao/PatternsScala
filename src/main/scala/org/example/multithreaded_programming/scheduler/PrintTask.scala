package org.example.multithreaded_programming.scheduler

class PrintTask(message: String) extends Task {

  override def execute(): Unit = {
    println("Executing task: " + message + " at " + System.currentTimeMillis())
  }
}
