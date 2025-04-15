package org.example.functional_patterns.cake

object Main {
  def main(args: Array[String]): Unit = {
    AppWithSqlDb.appService.connect()
  }

}
