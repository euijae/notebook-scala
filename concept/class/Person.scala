class Person(var firstName: String, var lastName: String) {
  def printFullName() = println(s"$firstName $lastName")
}

object Main extends App {
  val p = new Person("Euijae", "Kim")
  println(p.firstName)
  p.lastName = "Manes"
  p.printFullName()
}
