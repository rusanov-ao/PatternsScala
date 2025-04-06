package org.example.behavioral.iterator

object Main {
  def main(args: Array[String]): Unit = {

    val bookCollection: BookCollection = new BookCollection

    bookCollection.addBook(new Book("1984"))
    bookCollection.addBook(new Book("Brave New World"))
    bookCollection.addBook(new Book("Fahrenheit 451"))

    val iterator: Iterator = bookCollection.createIterator


    while (iterator.hasNext) {
      val book: Book = iterator.next().asInstanceOf[Book]
      println(book.getTittle)
    }
  }

}
