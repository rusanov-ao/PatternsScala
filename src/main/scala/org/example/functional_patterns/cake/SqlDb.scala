package org.example.functional_patterns.cake

case class SqlDb() extends Db {
  override def connection(): String = "Sql"
}
