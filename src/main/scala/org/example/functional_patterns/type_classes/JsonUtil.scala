package org.example.functional_patterns.type_classes

object JsonUtil {
  def serialize[T](value: T)(implicit serializer: JsonSerializer[T]): String = {
    serializer.toJson(value)
  }

}
