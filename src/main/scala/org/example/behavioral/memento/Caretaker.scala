package org.example.behavioral.memento

import scala.collection.mutable.ListBuffer

class Caretaker {
  private val mementos: ListBuffer[Memento] = new ListBuffer[Memento]

  def addMemento(memento: Memento): Unit = {
    mementos.append(memento)
  }

  def getMemento(index: Int): Memento = {
    mementos(index)
  }

}
