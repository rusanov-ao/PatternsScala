package org.example.behavioral.mediator

// Пользователи будут использовать метод у Медиатора для общения
object Mediator {

  def sendMessage(user: User, msg: String): Unit = {
    println(user.name + " " + msg)
  }

}
