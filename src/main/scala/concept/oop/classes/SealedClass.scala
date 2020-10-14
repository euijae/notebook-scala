package main.scala.concept.oop.classes

/**
 * @note 1. Sealed class can be inherited if child class is defined in the same source file.
 *       2. Subclass of a sealed class can be inherited from anywhere
 *       3. Traits and classes can be marked sealed which means all subtypes must be declared in the same file.
 *          This assures that all subtypes are known.
 */
sealed class SealedParentClass {
  // fields
  // methods
}

/**
 * This class can be inherited from anywhere outside of this source file.
 */
class SealedChildClass extends SealedParentClass
{
  // fields
  // methods
}

/**
 * @example
 */
sealed abstract class Furniture
case class Couch() extends Furniture
case class Chair() extends Furniture

object SealedClass extends App {
  def findPlaceToSit(piece: Furniture): String = piece match {
    // running either one of the followings results in warning message
    // "match may not be exhaustive"
    case a: Couch => "Lie on the couch"
    case b: Chair => "Sit on the chair"
  }

  val couch = Couch();
  println(findPlaceToSit(couch))
}