package org.example.functional_patterns.cake

case class NoSqlDb() extends Db {
  override def connection(): String = "NoSql"
}
