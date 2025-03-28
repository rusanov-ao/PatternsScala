package org.example.behavioral.visitor

class CarVisitor extends Visitor {
  override def visit(sportCar: SportCar): Unit = {
    println("Посещаем " + sportCar.getClass.getSimpleName)
  }

  override def visit(engine: Engine): Unit = {
    println("Посещаем " + engine.getClass.getSimpleName)
  }

  override def visit(wheel: Wheel): Unit = {
    println("Посещаем " + wheel.getClass.getSimpleName)
  }
}
