package org.example.behavioral.visitor

class Engine extends Car {
  // Передаем себя в качестве объекта посетителю
  override def accept(visitor: Visitor): Unit = {
    visitor.visit(this)
  }
}
