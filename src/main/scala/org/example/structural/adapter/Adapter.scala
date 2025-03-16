package org.example.structural.adapter

class Adapter(usb: USB) extends Flash {

  // Переопределяем метод и добавляем в него вызов метода из USB
  override def write(): Unit = {
    usb.connect()
    println("Данные успешно записаны на устройство")
  }

  // Переопределяем метод и добавляем в него вызов метода из USB
  override def read(): Unit = {
    usb.connect()
    println("Данные успешно считаны с устройства")
  }
}
