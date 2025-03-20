package org.example.structural.decorator

// Наследуемся от decorator и добавляем новый функционал в метод draw
class RedCarDecorator(car: Car) extends CarDecorator(car) {
  override def draw(): Unit = {
    car.draw()
    setColor()
  }

  private def setColor(): Unit = {
    println("Color: red")
  }
}
