package org.example.behavioral.command

class StopCar(car: Car) extends Command {
  override def execute(): Unit = {
    car.stopEngine()
  }
}
