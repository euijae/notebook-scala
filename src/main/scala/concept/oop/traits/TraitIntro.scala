package main.scala.concept.oop.traits

import main.scala.concept.oop.classes.Person

/**
 *  @note
 *        1. Traits are used to share interfaces and fields between classes.
 *        2. They are similar to Java 8’s interfaces.
 *        3. Classes and objects can extend traits, but traits cannot be instantiated and therefore have no parameters.
 *  @see https://docs.scala-lang.org/tour/traits.html
 */
trait TraitIntro {
  // variables
  // methods
}

/**
 * @note List of examples what inheritances are available using trait and class
 */

trait MyAnimal {
  def foo(): Unit = {
    println("Method foo in Animal trait")
  }
}

/**
 * @example Trait can extend a trait
 */
trait MyDog extends MyAnimal {
  override def toString: String = "Dog"
}

/**
 * @example abstract class can extend a trait
 */
abstract class MyBear extends MyAnimal {}

/**
 * @example concrete class can extend a trait
 */
class Pooh extends MyAnimal {}