package org.example.generative.abstractFactory

trait Factory {

  def getBMW(): BMW

  def getAudi(): Audi

  def getZeekr(): Zeekr

}
