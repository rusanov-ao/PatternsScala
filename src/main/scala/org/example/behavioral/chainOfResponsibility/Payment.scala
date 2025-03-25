package org.example.behavioral.chainOfResponsibility

trait Payment {

  def setNext(payment: Payment): Unit

  def pay(): Unit

}
