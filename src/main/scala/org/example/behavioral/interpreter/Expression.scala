package org.example.behavioral.interpreter

trait Expression {

  def interpreter(context: Context): String

}
