package org.example.structural.bridge

class UnknownEngine extends Engine {
  override def setEngine(): Unit = {
    println("unknown")
  }
}
