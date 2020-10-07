object ForLoop extends App {
  def lineBreaker(curr: Int, last: Int): String = {
    if(curr == last) "\n" else ", "
  }

  /**
   *
   */
  for (arg <- args) println(arg)

  for (i <- 0 to 5) print(i + lineBreaker(i, 5))

  // inclusive so end up printing 10
  for (i <- 0 to 10 by 2) print(i + lineBreaker(i, 10))

  /**
   * without keyword 'yield' the vector will be an empty
   */
  val vectorWithYieldFor = for (i <- 1 to 5) yield i * 2
  println(vectorWithYieldFor)

  /**
   *
   */
  val fruits = List("apple", "banana", "lime", "orange")

  val fruitLongerThanFour = for {
    f <- fruits
    if f.length > 4
  } yield f

  println(fruitLongerThanFour)
}
