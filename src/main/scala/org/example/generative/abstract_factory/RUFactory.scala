package org.example.generative.abstract_factory

/**
 * Реализуем абстрактную фабрику для России
 */

class RUFactory extends Factory {

  override def getBMW() = new RUBMW

  override def getAudi() = new RUAudi

  override def getZeekr() = new RUZeekr
}
