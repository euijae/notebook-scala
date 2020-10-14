package main.scala.concept.oop.traits

import main.scala.concept.oop.Jacuzzi

/**
 * @note There are two characteristic of sealed trait
 *       1) Scope: Sealed trait must be declared in the same file.
 *       2) Exhaustive checking: Traits and classes can be marked sealed which means all
 *          subtypes must be declared in the same file. This assures that all subtypes are known.
 *          This is useful for pattern matching because we don’t need a “catch all” case.
 * @see SealedTrait#getLanguageName for more information about exhaustive checking.
 */
sealed trait Language {
  val name: String
}

class Python extends Language {
  override val name: String = "Python"
}

class Java extends Language {
  override val name: String = "Java"
}

class JavaScript extends Language {
  override val name: String = "JavaScript"
}

object SealedTrait {
  def main(args: Array[String]): Unit = {
    val python = new Python
    val java = new Java
    val javaScript = new JavaScript

    println(getLanguageName(python))  // print Python
    println(getLanguageName(java))    // print Java
    println(getLanguageName(javaScript)) // Print JavaScript
  }

  def getLanguageName(languageType: Language): String = languageType match {
    // if running without any one of the 3 cases,
    // we are getting following `warning message`:
    //  "match may not be exhaustive. It would fail on the following input: JavaScript()"
    case p: Python => p.name
    case j: Java => j.name
    case js: JavaScript => js.name
  }
}