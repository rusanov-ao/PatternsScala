package org.example.behavioral.chain_of_responsibility

object Main {
  def main(args: Array[String]): Unit = {
     val visaPaymet: Payment = new VisaPaymet
     val masterCardPayment: Payment = new MasterCardPayment

    // Передаем управление другой платежной системе
    visaPaymet.setNext(masterCardPayment)
  }

}
