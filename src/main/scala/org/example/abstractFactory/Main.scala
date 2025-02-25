package org.example.abstractFactory

object Main {

  def main(args: Array[String]): Unit = {

    val country: String = "Russia"

    var factory: Factory = null

    /**
     * ПОлучаем сразу пачку объектов (BMW, Audi, Zeekr)
     */
    if (country.equals("Russia")) {
      factory = new RUFactory
    } else if (country.equals("USA")) {
      factory = new USAFactory
    }

    val bmw: BMW = factory.getBMW()

    println(bmw.getBMWPrice())

  }

}
