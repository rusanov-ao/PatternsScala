package org.example.functional_patterns.type_classes

trait JsonSerializer[T] {
  def toJson(value: T): String

}
