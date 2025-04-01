package org.example.behavioral.interpreter

class LowerExpression(s: String) extends Expression {

  override def interpreter(context: Context): String = {
    context.getLowerCase(s)
  }
}
