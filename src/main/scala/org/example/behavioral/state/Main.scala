package org.example.behavioral.state

object Main {
  def main(args: Array[String]): Unit = {

    val playContext: PlayContext = new PlayContext
    val startPlay: State = new StartPlay
    val stopPlay: State = new StopPlay

    playContext.setState(startPlay)
    playContext.doAction()

    playContext.setState(stopPlay)
    playContext.doAction()


  }

}
