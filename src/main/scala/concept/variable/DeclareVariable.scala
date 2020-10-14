package main.scala.concept.variable

/**
 * Here's list of variable types
 * 1. Byte
 * 2. Short
 * 3. Int
 * 4. Long
 * 5. Float
 * 6. Double
 * 7. Char
 * 8. String
 * 9. Boolean
 * 10. Unit // corresponds to no value
 * 11. Null // as same null in Java
 * 12. Nothing // subtype of every other type; includes no values
 * 13. Any // The supertype of any type. Any object is type of Any
 * 14. AnyRef // The supertype of any reference type
 */
object DeclareVariable extends App {
  val intWithoutDataType = 1
  val intWithDataType: Int = 1

  val stringWithoutDataType = "a string"
  val stringWithDataType: String = "a string"

  println("intWithoutDataType: " + intWithoutDataType)
  println("intWithDataType: " + intWithDataType)
  println("stringWithoutDataType: " + stringWithoutDataType)
  println("stringWithDataType: " + stringWithDataType)
}
