package org.example.functional_patterns.pimp_my_library

object Main {
  def main(args: Array[String]): Unit = {
    // Импортируем неявное преобразование
    import StringExtensions._

    val greeting = "HelloWorld"

    println(greeting.toSnakeCase)

  }

}
