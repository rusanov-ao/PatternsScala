package org.example.behavioral.state

class PlayContext extends State {
  private var state: State = _

  // Меняем состояние объектов
  def setState(state: State): Unit = {
    this.state = state
  }

  override def doAction(): Unit = {
    state.doAction()
  }
}
