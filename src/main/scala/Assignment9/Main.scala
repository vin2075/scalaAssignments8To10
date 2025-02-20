package Assignment9



import animals.{Dog, Cat}
import utils.AnimalUtils

object Main extends App {
  val dog = new Dog()
  val cat = new Cat()

  println(AnimalUtils.describeAnimal(dog))
  println(AnimalUtils.describeAnimal(cat))
}

