package org.example.generative.builder

case class Car(
                color: String,
                doors: Int,
                tires: Int,
                hasNavigator: Boolean,
                inSurancePolice: String
              )

object Car {

  // Внутри Car создадим класс Builder
  class Builder() {

    private var color: String = "Black"
    private var doors: Int = 4
    private var tires: Int = 16
    private var hasNavigator: Boolean = false
    private var insurancePolice: String = "Alfa"

    def setColor(color: String): Builder = {
      this.color = color
      this
    }

    def setDoors(doors: Int): Builder = {
      this.doors = doors
      this
    }

    def setTires(tires: Int): Builder = {
      this.tires = tires
      this
    }

    def setHasNavigator(hasNavigator: Boolean): Builder = {
      this.hasNavigator = hasNavigator
      this
    }

    def setInsurancePolice(insurance: String): Builder = {
      this.insurancePolice = insurance
      this
    }

    // Метод build будет создавать объект Car с заполненными полями и возвращать нам его
    def build(): Car = {
      Car(color, doors, tires, hasNavigator, insurancePolice)
    }
  }

  // Метод builder будет возвращать объект Builder, который потом будет настраивать поля
  def builder(): Builder = {
    new Builder
  }
}