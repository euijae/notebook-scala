package main.scala.concept.oop.classes

abstract class AbstractClass {
  def getMessage: String = "great" // it won't cause an error. Either declare abstract class or implement the method
}
