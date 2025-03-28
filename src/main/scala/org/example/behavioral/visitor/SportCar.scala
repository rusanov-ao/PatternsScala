package org.example.behavioral.visitor

import scala.collection.mutable.ArrayBuffer

class SportCar extends Car {

  // При создании объекта SportCar будет автоматически создаваться объекты Wheel и Engine
  val cars: ArrayBuffer[Car] = ArrayBuffer[Car](new Engine, new Wheel)

  override def accept(visitor: Visitor): Unit = {
    // Разрешаем посетителю доступ к объектам в массиве
    for (car <- cars) {
      car.accept(visitor)
    }
    // Разрешаем посетителю доступ к объекту SportCar
    visitor.visit(this)
  }
}
