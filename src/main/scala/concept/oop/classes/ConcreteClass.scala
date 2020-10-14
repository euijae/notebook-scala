package main.scala.concept.oop.classes

/**
 *  @constructor defines two params, firstName and lastName
 *  @note Accessor/Mutator - Scala does not follow the Java convention of prepending set/get to mutator and accessor methods (respectively). Instead, the following conventions are used:
 *        For more information about accessor/mutator please check out the following link
 *  @see  https://docs.scala-lang.org/style/naming-conventions.html
 */
class Person(var firstName: String, var lastName: String) { // `val firstName` makes firstName immutable

  def printFullName(): Unit = println(s"$firstName $lastName")
}

/**
 * Example code of Person class
 */
object ConcreteClass extends App {
  val p = new Person("Euijae", "Kim")
  println(p.firstName)
  p.lastName = "Manes"
  p.printFullName()
}