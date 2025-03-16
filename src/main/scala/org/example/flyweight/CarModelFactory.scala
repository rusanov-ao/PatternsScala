package org.example.flyweight

import scala.collection.mutable

object CarModelFactory {

  private final val cache: mutable.Map[String, CarModel] = new mutable.HashMap[String, CarModel]()

  def getCarModel(brand: String, model: String, enginePower: Int): CarModel = {
    val key: String = brand + model + enginePower
    var carModel: CarModel = cache.getOrElse(key, null)
    if (carModel == null) {
      carModel = CarModel(brand, model, enginePower)
      cache.put(key, carModel)
      println("Создана новая модель " + brand + " " + model)
    }
    carModel
  }

  def getCacheSize(): Unit = {
    cache.size
  }
}
