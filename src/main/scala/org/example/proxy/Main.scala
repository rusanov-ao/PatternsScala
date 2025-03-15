package org.example.proxy

object Main {

  def main(args: Array[String]): Unit = {

    val image: Image = new ProxyImage("test.jpg")

    image.display()
    image.display()
  }

}
