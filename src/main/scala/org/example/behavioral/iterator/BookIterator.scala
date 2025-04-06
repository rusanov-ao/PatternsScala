package org.example.behavioral.iterator

class BookIterator(bookCollection: BookCollection) extends Iterator {

  var index: Int = 0

  override def hasNext: Boolean = {
    index < bookCollection.getSize
  }

  override def next(): Object = {
    if (this.hasNext) {
      val book: Book = bookCollection.getBookAt(index)
      index += 1
      book
    } else {
      null
    }
  }
}
