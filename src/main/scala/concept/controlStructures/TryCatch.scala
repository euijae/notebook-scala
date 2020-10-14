package main.scala.concept.controlStructures

import java.io.FileNotFoundException
import java.io.IOException

object TryCatch extends App {

  try {
    val result = 11/0
  } catch {
    case fnfe: FileNotFoundException => println(fnfe)
    case ioe: IOException => println(ioe)
    case ae: ArithmeticException => println(ae)
  } finally {
    println("Yes we are done.")
  }
}
