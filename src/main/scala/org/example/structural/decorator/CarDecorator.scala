package org.example.structural.decorator

// // Создаем абстрактный класс Decorator, с помощью которого можно будет наследоваться и расширять классы
abstract class CarDecorator(car: Car) extends Car {

  override def draw(): Unit = {
    car.draw()
  }
}
