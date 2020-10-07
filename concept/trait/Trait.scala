trait Speaker {
  def speak(): String // no body, so it's an abstract
}

trait TailWagger {
  def startTail(): Unit = println("tail is wagging")
  def stopTail(): Unit = println("tail is stopped")
}

trait Runner {
  def startRunning(): Unit = println("I'm running")
  def stopRunning(): Unit = println("I'm stopping")
}

class Dog(name: String) extends Speaker with TailWagger with Runner {
  def speak(): String = "Woof!"
}

class Cat extends Speaker with TailWagger with Runner {
  def speak(): String = "Meow"
  override def startRunning(): Unit = println("Yeah ... I don't run")
  override def stopRunning(): Unit = println("No need to stop")
}

object Trait extends App {
  val dog = new Dog("Russell")
  println(dog.speak())
  dog.startTail()
  dog.stopTail()
  dog.startRunning()
  dog.stopRunning()

  val cat = new Cat()
  println(cat.speak())
  cat.startTail()
  cat.stopTail()
  cat.startRunning()
  cat.stopRunning()
}
