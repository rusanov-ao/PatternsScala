package org.example.behavioral.command

class StartCar(car: Car) extends Command {
  override def execute(): Unit = {
    car.startEngine()
  }
}
