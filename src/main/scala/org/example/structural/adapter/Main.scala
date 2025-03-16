package org.example.structural.adapter

object Main {

  def main(args: Array[String]): Unit = {

    // Создаем объект Адаптер
    val flash: Flash = new Adapter(new USB)

    // Вызываем метод read, который внутри вызовет метод connect
    flash.read()
  }

}
