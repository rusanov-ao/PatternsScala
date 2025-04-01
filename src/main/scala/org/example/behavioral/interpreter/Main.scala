package org.example.behavioral.interpreter

object Main {
  def main(args: Array[String]): Unit = {

    var str: String = "TesT"

    val context: Context = new Context

    val lowerExpression: Expression = new LowerExpression(str)
    str = lowerExpression.interpreter(context)
    println(str)
  }

}
