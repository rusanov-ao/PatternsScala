package org.example.proxy

class ProxyImage(file: String) extends Image {
   private var image: RealImage = _

  override def display(): Unit = {
    if (image == null) {
      image = new RealImage(file)
    }

    image.display()
  }
}
