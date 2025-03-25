package org.example.behavioral.strategy

object Main {
  def main(args: Array[String]): Unit = {

    val content: Content = new Content(new DownloadLinuxStrategy)

    content.download("file.txt")
  }

}
