package main.scala.concept.controlStructures

object While extends App {

  def whileStatement(value: Int, start: Int, end: Int): Unit = {
    print(if(value == start) "[" else "")
    print(value)
    print(if(value == end) "]\n" else ", ")
  }

  var x = 0

  while(x <= 10) {
    whileStatement(x, 0, 10)
    x = x + 1
  }

  while(x <= 20) {
    whileStatement(x, 11, 20)
    x = x + 1
  }

  do {
    whileStatement(x, 21, 30)
    x = x + 1
  } while(x <= 30)
}
