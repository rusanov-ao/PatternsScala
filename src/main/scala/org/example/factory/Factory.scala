package org.example.factory

class Factory {

  def getCurrentOS(inputOS: String): OS = {
    inputOS match {
      case "linux" => new LinuxOS
      case "windows" => new WindowsOS
      case "mac" => new MacOS
      case _ => throw new IllegalArgumentException("Неизвестная операционная система")
    }
  }

}