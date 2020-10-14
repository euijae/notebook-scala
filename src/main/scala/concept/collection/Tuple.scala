package main.scala.concept.collection

object Tuple extends App {
  /**
   *  create a tuple that contains two types
   */
  val t = (11, "Eleven")

  println(s"t: $t")
  println(t._1)
  println(t._2)

  /**
   *  assign the tuple fields to variables
   */
  val (num, string) = (11, "Eleven")
  println(num)
  println(string)
}
