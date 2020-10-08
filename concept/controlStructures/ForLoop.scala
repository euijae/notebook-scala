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
  println(s"vectorWithYieldFor: $vectorWithYieldFor")


  /**
   *
   */
  val fruits = List("apple", "banana", "lime", "orange")

  val fruitLongerThanFour = for {
    f <- fruits
    if f.length > 4
  } yield f

  println(s"fruitLongerThanFour: $fruitLongerThanFour")

  // variable for map and filter
  val helloWorld = "hello, world"
  val hello = "HELLO"

  /**
   *  map
   */
  val toUpperMap1 = helloWorld.map(_.toUpper)
  val toUpperMap2 = helloWorld.map(c => c.toUpper)
  println(s"toUpperMap1: $toUpperMap1")
  println(s"toUpperMap2: $toUpperMap2")

  val upperTo32Map1 = hello.map(c =>(c.toByte+32).toChar)
  val upperTo32Map2 = hello.map{
    c => (c.toByte + 32).toChar
  }
  println(s"upperTo32Map1: $upperTo32Map1")
  println(s"upperTo32Map2: $upperTo32Map2")

  def toLower(c: Char): Char = (c.toByte+32).toChar

  val toLowerByFunctionMap = hello.map(toLower)
  val toLowerByForYield = for (c <- hello) yield toLower(c)
  println(s"toLowerByFunctionMap: $toLowerByFunctionMap")
  println(s"toLowerByForYield: $toLowerByForYield")

  /**
   *  filter
   */
  val filterAndUpperMap = helloWorld.filter(_ != 'l').map(_.toUpper)
  println(s"filterAndUpperMap: $filterAndUpperMap")

  /**
   *  for loop iterating each characters
   */
  for(c <- helloWorld) print(c)
  println("")

  val toUpperForYield1 = for(c <- helloWorld) yield c.toUpper
  val toUpperForYield2 = for {
    c <- helloWorld
    if c != 'l'     // optional
  } yield c.toUpper

  println(s"toUpperForYield1: $toUpperForYield1")
  println(s"toUpperForYield2: $toUpperForYield2")

  /**
   *
   */
}
