package org.example.behavioral.state

class StopPlay extends State {
  override def doAction(): Unit = {
    println("Stop play")
  }
}
