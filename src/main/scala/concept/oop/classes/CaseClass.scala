package main.scala.concept.oop.classes

/**
 * @see https://docs.scala-lang.org/tour/case-classes.html#
 * @note "Case classes are like regular classes with a few key differences which
 *       we will go over. Case classes are good for modeling immutable data."
 * @constructor It takes one param isbn and case class with parameters are public `val`s (immutable)
 */
case class Book(isbn: String, author: String, year: Int)
  /**
   * @note inheritance of sealed class - this is illegal inheritance.
   *       The class marked with sealed should only be inherited within the same source file
   */
//  extends SealedParentClass // please comment out this line before compiling the file


object CaseClass extends App {
  /**
   * @note Instantiate - The keyword new is not used because case classes have an apply
   *       method by default which takes care of object construction.
   */
  val testBook = new Book("test_isbn", "test_person", 2020) // keyword new is grayed out.

  /**
   * Test case class without keyword `new`
   */
  val myBook = Book("978-0486282114", "John Doe", 1996)
  println(myBook) // print Book(978-0486282114,John Doe,1996)
  println(myBook.isbn)    // print 978-0486282114
  println(myBook.author)  // print John Doe
  println(myBook.year)    // print 1996

  /**
   *  @note reassignment - please comment this out before running the code because reassignment to val is illegal
   */
//  myBook.year = 1997

  /**
   *  @note comparison - Instances of case classes are compared by structure and not by reference
   */
  val book1 = Book("123-1234567", "Jane Doe", 2020)
  val book2 = Book("123-1234567", "Jane Doe", 2020)
  val book3 = Book("123-1234567", "Jane doe", 2020) // case sensitive

  val book1AndBook2AreTheSame = book1 == book2
  val book1AndBook3AreTheSame = book1 == book3
  println(book1AndBook2AreTheSame) // print true
  println(book1AndBook3AreTheSame) // print false

  println(book1.hashCode())
  println(book2.hashCode()) // book1 and book2 have same hashCode
  println(book3.hashCode())

  /**
   * @note Copying - we can create a (shallow) copy of an instance
   */
  val book4 = Book("987-654321", "River Phoenix", 1991)
  val book5 = book4.copy(isbn = book4.isbn, author = "Keanu Reeves")

  println(book4)
  println(book5)
}