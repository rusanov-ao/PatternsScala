package org.example.behavioral.memento

object Main {
  def main(args: Array[String]): Unit = {

    val user: User = new User("Alice", 30)

    val caretaker: Caretaker = new Caretaker

    // Сохраняем состояние пользователя
    caretaker.addMemento(user.save())

    // Изменяем состояние пользователя
    user.restore(new Memento("Bob", 25))

    // Восстанавливаем предыдущее состояние пользователя
    user.restore(caretaker.getMemento(0))

    // Выводим текущее состояние пользователя
    println("Current state: Name = " + user.name + ", Age = " + user.age)




  }

}
