package org.example.behavioral.visitor

trait Visitor {

  // Методы для посещения объектов
  def visit(sportCar: SportCar): Unit

  def visit(engine: Engine): Unit

  def visit(wheel: Wheel): Unit

}
