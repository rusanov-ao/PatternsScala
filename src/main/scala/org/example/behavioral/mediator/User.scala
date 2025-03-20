package org.example.behavioral.mediator

// Создадим класс пользователей
class User(val name: String) {

  // Метод будет вызывать статический метод из медиатора и передавать свой объект и сообщение
  def sendMessage(msg: String): Unit = {
    Mediator.sendMessage(this, msg)
  }

}
