package org.example.behavioral.strategy

class DownloadLinuxStrategy extends Strategy {

  override def download(file: String): Unit = {
    println("Linux download " + file)
  }
}
