object DeclareVariable extends App {
  val intWithoutDataType = 1
  val intWithDataType: Int = 1

  val stringWithoutDataType = "a string"
  val stringWithDataType: String = "a string"

  println("intWithoutDataType: " + intWithoutDataType)
  println("intWithDataType: " + intWithDataType)
  println("stringWithoutDataType: " + stringWithoutDataType)
  println("stringWithDataType: " + stringWithDataType)
}
