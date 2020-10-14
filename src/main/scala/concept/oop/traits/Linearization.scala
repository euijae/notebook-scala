package main.scala.concept.oop.traits

/**
 * @example Linearization for class which extends only multiple traits
 */
class A { def foo() = "A" }
trait B extends A { override def foo(): String = "B->" + super.foo() }
trait C extends B { override def foo(): String = "C->" + super.foo() }
trait D extends A { override def foo(): String = "D->" + super.foo() }

/**
 * @example Linearization for class which extends class and multiple traits
 */
class Shape { def paint: String = "Shape" }
trait Color extends Shape { override def paint: String = "Color->" + super.paint }
trait Blue extends Color { override def paint: String = "Blue->" + super.paint }
trait Border extends Shape { override def paint: String = "Border->" + super.paint }
trait Dotted extends Border { override def paint: String = "Dotted->" + super.paint }

class MyShape extends Shape with Dotted with Blue { override def paint: String = "MyShape->" + super.paint }

object Linearization extends App {

  // Linearization for class which extends only multiple traits
  var d = new A with D with C with B;
  println(d.foo())

  // Linearization for class which extends class and multiple traits
  val myShape = new MyShape
  print(myShape.paint)
}