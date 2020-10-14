package main.scala.concept.collection

object Lists extends App {

  // left: inclusive and right: exclusive
  val zeroToNine = List.range(0, 10)

  // 1 and 10 are inclusive
  val oneToTen = (1 to 10).toList
  val oddNumbers = (1 to 10 by 2).toList
  val atof = ('a' to 'f').toList
  val atofEveryOtherChars = ('a' to 'f' by 2).toList
  val names = List("joel", "ed", "chris", "maurice")

  println(s"zeroToNine: $zeroToNine")
  println(s"oneToTen: $oneToTen")
  println(s"oddNumbers: $oddNumbers")
  println(s"atof: $atof")
  println(s"atofEveryOtherChars: $atofEveryOtherChars")
  println(s"names: $names")

  // foreach method
  names.foreach(println)
  atofEveryOtherChars.foreach(println)

  // filter method
  oneToTen.filter(_ < 7).foreach(println)

  // map method
  val doubles = oneToTen.map(_ * 2)
  val capNames = names.map(_.capitalize)
  val lessThanFive = oneToTen.map(_ < 5)

  println(doubles)
  println(capNames)
  println(lessThanFive)

  // foldLeft - first param is default/init value
  val foldLeft1 = oneToTen.foldLeft(0)(_ + _)
  val foldLeft2 = oneToTen.foldLeft(1)(_ * _)

  println(foldLeft1)
  println(foldLeft2)
}
