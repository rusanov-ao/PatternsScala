package org.example.generative.factory

import java.io.{BufferedReader, InputStreamReader}

object Main {
  def main(args: Array[String]): Unit = {

    val factory: Factory = new Factory

    val bufferedReader = new BufferedReader(new InputStreamReader(System.in))

    val getOS: String = bufferedReader.readLine()

    val os: OS = factory.getCurrentOS(getOS)
    os.getOS()




  }

}
