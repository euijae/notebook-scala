import java.lang.String.format

object Match extends App {
  /**
   *
   */
  val matchingVariable = 2
  val numberAsString = matchingVariable match {
    case 1 => "one"
    case 2 => "two"
    case _ => "not 1 or 2"
  }
  println("matchingVariable: " + matchingVariable)
  println("numberAsString: " + numberAsString)

  /**
   *
   */
  val matchingBool = true
  val booleanAsString = matchingBool match {
    case true => "true"
    case false => "false"
  }

  println("matchingBool: " + matchingBool)
  println("booleanAsString: " + booleanAsString)

  /**
   *
   */
  def getClassAsString(x: Any): String = x match {
    case s: String => s + " is a string"
    case i: Int => "Int"
    case f: Float => "Float"
    case l: List[_] => "List"
    case _ => "Unknown"
  }

  val s: String = "STRING"
  val i: Int = 1
  val f: Float = 1.1f
  val l: List[_] = List(1,2,3)
  var any = null
  println("Test for getClassAsString")
  println(format("getClassAsString(%s) = %s", s, getClassAsString(s)))
  println(format("getClassAsString(%d) = %s", i, getClassAsString(i)))
  println(format("getClassAsString(%f) = %s", f, getClassAsString(f)))
  println(format("getClassAsString(List(1,2,3)) = %s", getClassAsString(l)))
  println(format("getClassAsString(null) = " + getClassAsString(any)))
}
