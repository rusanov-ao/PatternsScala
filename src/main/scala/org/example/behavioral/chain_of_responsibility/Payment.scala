package org.example.behavioral.chain_of_responsibility

trait Payment {

  def setNext(payment: Payment): Unit

  def pay(): Unit

}
