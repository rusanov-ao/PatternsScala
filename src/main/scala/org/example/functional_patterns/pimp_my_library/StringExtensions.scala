package org.example.functional_patterns.pimp_my_library

object StringExtensions {

  // Создаем обертку (wrapper)
  implicit class RichString(val str: String) extends AnyVal {

    // Добавляем новый метод toSnakeCase
    def toSnakeCase: String = {
      str.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase()
    }
  }

}
