package org.example.functional_patterns.duck_typing

import scala.language.reflectiveCalls

object Main {
  def main(args: Array[String]): Unit = {

    // Duck и ToyDuck должны иметь метод с одинаковым названием, одинаковыми параметрами и сигнатурой
    val realDuck: Duck = new Duck
    val toyDuck: ToyDuck = new ToyDuck

    makeSound(realDuck)
    makeSound(toyDuck)

  }

  // в качестве параметра мы прописываем структурный тип duck и в {} сам метод с сигнатурой
  //private def makeSound(duck: {def quack: String}): Unit = {
  // println(duck.quack)
  //}

  // в качестве параметра мы прописываем структурный тип duck и в {} сам метод с сигнатурой
  private def makeSound(duck: DuckType): Unit = {
    println(duck.quack)
  }

  // воспользуемся утиной типизацией и введем новый тип
  private type DuckType = {
    def quack: String
  }

}
