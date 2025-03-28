package org.example.behavioral.visitor

trait Car {

  // Метод для доступа Посетителя
  def accept(visitor: Visitor): Unit

}
