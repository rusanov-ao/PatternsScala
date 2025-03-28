package org.example.behavioral.command

class CarInvoike(command: Command) {

  def execute(): Unit = {
    command.execute()
  }

}
