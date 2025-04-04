package org.example.behavioral.iterator

import scala.collection.mutable.ArrayBuffer

class BookCollection {

  private val arrayBook: ArrayBuffer[Book] = new ArrayBuffer[Book]()

  def addBook(book: Book): Unit = {
    arrayBook.append(book)
  }

  def getBookAt(index: Int): Book = {
    arrayBook(index)
  }

  def getSize: Long = {
    arrayBook.size
  }

  def createIterator: Iterator = new BookIterator(this)

}

