package org.example.functional_patterns.cake
// Создаем компонент для приложения
trait AppComponent {
// Используем самотип, вместо наследования (self-types)
  self: DbComponent =>

  val appService: AppService


  class AppService {
    def connect(): Unit = {
      println(s"Connection to ${self.db.connection()}")
    }
  }

}
