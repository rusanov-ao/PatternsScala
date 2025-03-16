package org.example.structural.flyweight

object Main {

  def main(args: Array[String]): Unit = {

    val car1: Car = new Car(
      CarModelFactory.getCarModel("Toyota", "Corolla", 120),
      "Красный",
      2020
    )

    val car2: Car = new Car(
      CarModelFactory.getCarModel("Toyota", "Corolla", 120),
      "Синий",
      2021
    )

    val car3: Car = new Car(
      CarModelFactory.getCarModel("Honda", "Civic", 150),
      "Черный",
      2019
    )

    // Вывод информации
    car1.fullDisplayInfo()
    car2.fullDisplayInfo()
    car3.fullDisplayInfo()

    println("Количество моделей в кэше: " + CarModelFactory.getCacheSize())

  }

}
