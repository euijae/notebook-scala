package main.scala.concept.oop.traits

import scala.collection.mutable.ArrayBuffer

/**
 * The trait Pet has an abstract field name that gets implemented by Cat and Dog in their constructors.
 */
trait Pet {
  val name: String
}

trait TailWagger {
  def startTail(): Unit = println("tail is wagging")
  def stopTail(): Unit = println("tail is stopped")
}

trait Runner {
  def startRunning(): Unit = println("I'm running")
  def stopRunning(): Unit = println("I'm stopping")
}

// field name in trait `Pet` gets implemented by Dog
class Dog(val name: String) extends Pet with TailWagger with Runner

// field name in trait `Pet` gets implemented by Cat
class Cat(val name: String) extends Pet with TailWagger with Runner {

  // how to override methods
  override def startRunning(): Unit = println("Yeah ... I don't run")
  override def stopRunning(): Unit = println("No need to stop")
}

object TraitSubtyping extends App {
  val dog = new Dog("Doggy")

  // called methods in trait as the methods are not overridden in Dog class
  dog.startTail()
  dog.stopTail()
  dog.startRunning()
  dog.stopRunning()

  val cat = new Cat("Kitty")

  cat.startTail()
  cat.stopTail()
  cat.startRunning()
  cat.stopRunning()

  // subtyping
  val animals = ArrayBuffer.empty[Pet]
  animals.append(dog)
  animals.append(cat)

  animals.foreach(animal => println(animal.name)) // print Doggy \n Kitty
}
