package main.scala.concept.method

object OneLine extends App {
  // legal to write the methods without return type
  def sum(a: Int, b: Int): Int = a + b
  def concatenate(s1: String, s2: String): String = s1 + s2

  val sumOfTwoNumbers = sum(1, 2)
  val concatenateTwoStrings = concatenate("first", "next")

  println(s"sumOfTwoNumbers: $sumOfTwoNumbers")
  println(s"concatenateTwoStrings: $concatenateTwoStrings")
}
