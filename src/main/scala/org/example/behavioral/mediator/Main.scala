package org.example.behavioral.mediator

object Main {
  def main(args: Array[String]): Unit = {

    val user1: User = new User("Alex")
    val user2: User = new User("Mike")

    user1.sendMessage("message1")
    user2.sendMessage("message2")
  }

}
