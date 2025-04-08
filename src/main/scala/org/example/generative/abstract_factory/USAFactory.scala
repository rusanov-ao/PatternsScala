package org.example.generative.abstract_factory

/**
 * Реализуем абстрактную фабрику для США
 */

class USAFactory extends Factory {


  override def getBMW() = new USABMW

  override def getAudi() = new USAAudi

  override def getZeekr() = new USAZeekr
}
