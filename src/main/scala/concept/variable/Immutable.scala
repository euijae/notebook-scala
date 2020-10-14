package main.scala.concept.variable


object Immutable extends App {
  try {
    val x = 1
    // the following will cause compile error as x is immutable
    // x = 10
  } catch {
    case e: Error => println(e)
  }
}
