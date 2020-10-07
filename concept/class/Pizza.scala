/**
 *  CrustSize, CrustType, and Topping classes aren't shown.
 *  Please use this class to understand the structure of class.
 */
class Pizza (
  var curstSize: CrustSize,
  var crustType: CrustType,
  // ArrayBuffer is like Java's ArrayList
  val toppings: ArrayBuffer[Topping]
) {
  def addTopping(t: Topping): Unit = toppings += t
  def removeTopping(t: Topping): Unit = toppings -= t
  def removeAllToppings(): Unit = toppings.clear()
}
