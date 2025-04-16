package org.example.functional_patterns.type_classes

object Main {
  def main(args: Array[String]): Unit = {

    import JsonSerializers._

    val number = 42
    println(JsonUtil.serialize(number))

    val text = "Hello World"
    println(JsonUtil.serialize(text))

    val person: Person = Person("Alex", 30)
    println(JsonUtil.serialize(person))


  }
}
