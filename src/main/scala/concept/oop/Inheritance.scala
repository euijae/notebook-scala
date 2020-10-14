package main.scala.concept.oop

/**
 * @note To explain differences between extends and with keywords
 */

/**
 * @note inheritance - Illegal inheritance if any of trait or class outside of
 *       this source file extends sealed trait defined in this source file
 */
sealed trait Garage
sealed trait Jacuzzi

abstract class House(param1: String, param2: String) {}

/**
 * 1. you can extend up to one (concrete or abstract) class
 * 2. but you can extend as many traits as you'd like
 * 3. Using keyword `extends`, you can extend class or trait
 * 4. Using keyword `with`, you can only extend traits
 * 5. If you won't extend class but inherit multiple traits, first trait should come after `extends` keyword
 *
 * @example if SingleHouse won't extend class House, we can put first trait after `extends` keyword as follows
 * class SingeHouse(address: String, price: Double)
 *    extends Jacuzzi // this is trait but extended
 *    with Garage
 */
class SingleHouse(address: String, price: Double)
  extends House(
    // these are params of constructor of parent class `House`
    // we need to specify them in constructor of child class
    param1 = "my param1",
    param2 = "my param2"
  )
  with Jacuzzi
  with Garage

/**
 * @example The following is Invalid due to the following reasons,
 *          1. The first extended element (class or trait) should come after `extends`
 *          2. The class SingleHouse2 has to be extended by declaring `extends House`
 */
//class SingleHouse2
//  with House(param1 = "p1", param2 = "p2")

/**
 * @note If you won't extend class but trait, first trait should come after the keyword `extends`
 */
class SingleHouse3
  extends Jacuzzi   // first trait

/**
 * @note If you won't extend class but multiple traits, first trait comes after the keyword `extends`
 *       and append as many traits as you want after the keyword `with`
 */
class SingleHouse4
  extends Jacuzzi   // first trait
  with Garage       // second trait

/**
 * @note This is invalid inheritance due to the following reasons,
 *       1. If you want to extend class and trait, you should extend class first
 *       2. so the expected declaration is `extends House(...) with Jacuzzi`
 */
//class SingleHouse5
//  extends Jacuzzi
//  with House(param1 = "p1", param2 = "p2")

object Inheritance extends App {}