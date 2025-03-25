package org.example.behavioral.strategy

class DownloadWindowsStrategy extends Strategy {

  override def download(file: String): Unit = {
    println("Windows download " + file)
  }
}
