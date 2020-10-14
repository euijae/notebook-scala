package main.scala.concept.oop.traits

/**
 * example of trait with abstract method and generic type (in this example `A` and `B`)
 * @tparam A - generic type
 * @tparam B - generic type. Added this to show how to have multiple generic types
 */
trait Iterator[A, B] { // <A, B> in Java
  def hasNext: Boolean;
  def next(): A;
  def getMessage: B; // can be empty-parens if one without param or side-effects
}

class IntIterator(to: Int, message: String) extends Iterator[Int, String] {
  private var current = 0

  override def hasNext: Boolean = current < to

  override def next(): Int = {
    if(hasNext) {
      val t = current
      current += 1
      t
    } else 0
  }

  override def getMessage: String = message
}

// runner object for the traits
object TraitAbstractMethodGenericType extends App {
  val intIterator = new IntIterator(3, "this is my message")

  println(intIterator.next()) // print 0
  println(intIterator.next()) // print 1
  println(intIterator.next()) // print 2

  // getMessage is defined as empty paren method.
  // Calling the method with paren will make error.
  println(intIterator.getMessage) // print "this is your message"
}


