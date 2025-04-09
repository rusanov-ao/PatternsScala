package org.example.multithreaded_programming.lock

import java.util.concurrent.locks.{Lock, ReentrantLock}

class Counter {
  private var count: Int = 0
  private final val lock: Lock = new ReentrantLock()

  def increment(): Unit = {
    lock.lock()
    try {
      count += 1
    } finally {
      lock.unlock()
    }
  }

  def getCount: Int = count

}
