object IfElse extends App {
  val number: Int = 100

  if(number == 100) {
    println("A+")
  } else if(number < 100 && number >= 90) {
    println("A")
  } else if(number < 90 && number >= 80) {
    println("B")
  } else {
    println("Try again.")
  }

  val result = if(number == 100) "A+" else "not A+"
  println("result: " + result)
}
