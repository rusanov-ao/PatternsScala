package org.example.functional_patterns.cake

// Создаем приложение с Sql базой
object AppWithSqlDb extends Components {
  override val appService: AppService = new AppService
  override val db: Db = new SqlDb
}
