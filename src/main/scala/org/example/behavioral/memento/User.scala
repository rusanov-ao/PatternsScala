package org.example.behavioral.memento

class User(var name: String, var age: Int) {

  def save(): Memento = {
    System.out.println("save: name = " + name + ", age = " + age)
    new Memento(name, age)
  }

  def restore(memento: Memento): Unit = {
    name = memento.name
    age = memento.age
    System.out.println("restore: name = " + name + ", age = " + age)
  }

}
