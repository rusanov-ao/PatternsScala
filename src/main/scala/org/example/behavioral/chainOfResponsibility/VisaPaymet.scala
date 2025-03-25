package org.example.behavioral.chainOfResponsibility

class VisaPaymet extends Payment {
  private var nextPayment: Payment = _

  // Метод позволяет провести оплату через другую платежную систему
  override def setNext(payment: Payment): Unit = {
    this.nextPayment = payment
    nextPayment.pay()
  }

  override def pay(): Unit = {
    println("Visa payment")
  }
}
