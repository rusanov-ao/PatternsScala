package org.example.behavioral.observer

object Main {
  def main(args: Array[String]): Unit = {

    // Наблюдатель
    val director: Director = new Director

    // Университет
    val university: University = new University

    // Добавляем в университет наблюдателя
    university.addObserver(director)

    university.addStudent("Mike")
    university.addStudent("Sara")

    university.addStudent("Unknown")
    university.removeStudent("Unknown")


  }

}
