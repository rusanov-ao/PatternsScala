package org.example.behavioral.strategy

class Content(strategy: Strategy) {

  // Метод будет выполняться в зависимости от выбранного объекта
  def download(file: String): Unit = {
    strategy.download(file)
  }

}
