package org.example.functional_patterns.type_classes

object JsonSerializers {

  // Создаем анонимный класс с получением его экземпляра и переопределением метода.
  // Чтобы не наследовать object JsonSerializers от trait JsonSerializer
  implicit val intSerializer: JsonSerializer[Int] = new JsonSerializer[Int] {
    override def toJson(value: Int): String = s"""{"value":$value}"""
  }

  // Создаем анонимный класс с получением его экземпляра и переопределением метода.
  // Чтобы не наследовать object JsonSerializers от trait JsonSerializer
  implicit val stringSerializer: JsonSerializer[String] = new JsonSerializer[String] {
    override def toJson(value: String): String = s"""{"value":"$value"}"""
  }

  // Создаем анонимный класс с получением его экземпляра и переопределением метода.
  // Чтобы не наследовать object JsonSerializers от trait JsonSerializer
  implicit val personSerializer: JsonSerializer[Person] = new JsonSerializer[Person] {
    override def toJson(value: Person): String = s"""{"name":"${value.name}", "age":${value.age}}"""
  }

}
