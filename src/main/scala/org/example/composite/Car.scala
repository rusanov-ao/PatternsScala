package org.example.composite

/**
 * Интерфейс Car определяет общий метод draw(String color),
 * который должен реализовывать любой объект, представляющий автомобиль.
 */
trait Car {

  def draw(color: String): Unit

}

/**
 * Классы SportCar и UnknownCar являются листьями в древовидной структуре. Они реализуют интерфейс Car
 * и предоставляют конкретную реализацию метода draw.
 */

class SportCar extends Car {

  override def draw(color: String): Unit = {
    println("SportCar color: " + color)
  }

}


class UnknownCar extends Car {

  override def draw(color: String): Unit = {
    println("UnknownCar color: " + color)
  }

}

/**
 * Класс Drawing является композитом (или компоновщиком). Он:
 * Хранит список объектов типа Car.
 * Реализует метод draw(String color) так, чтобы он вызывал этот метод для каждого объекта в списке.
 * Предоставляет методы add(Car car) для добавления новых автомобилей и clear() для очистки списка.
 * Таким образом, Drawing может содержать как листья (SportCar, UnknownCar), так и другие композиты
 * (если бы они существовали).
 */

import scala.collection.mutable.ArrayBuffer

class Draw extends Car {

  private val cars: ArrayBuffer[Car] = new ArrayBuffer[Car]

  override def draw(color: String): Unit = {
    for (car <- cars) {
      car.draw(color)
    }
  }

  def add(car: Car): Unit = {
    this.cars.insert(0, car)
  }

  def clear(): Unit = {
    println()
    this.cars.clear()
  }
}