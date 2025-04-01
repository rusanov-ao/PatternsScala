package org.example.behavioral.interpreter

class UpperExpression(s: String) extends Expression {

  override def interpreter(context: Context): String = {
    context.getUpperCase(s)
  }
}
