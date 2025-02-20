package AssignmentTest9



import org.scalatest.funsuite.AnyFunSuite
import Assignment9.animals.{Dog, Cat}
import Assignment9.utils.AnimalUtils

class AnimalTests extends AnyFunSuite {

  test("Dog should speak and walk") {
    val dog = new Dog()
    assert(dog.speak() == "Woof!")
    assert(dog.walk() == "I am walking.")
  }

  test("Cat should speak and walk") {
    val cat = new Cat()
    assert(cat.speak() == "Meow!")
    assert(cat.walk() == "I am walking.")
  }

  test("AnimalUtils should describe animals correctly") {
    val dog = new Dog()
    val cat = new Cat()

    assert(AnimalUtils.describeAnimal(dog) == "Dog says: Woof! and I am walking.")
    assert(AnimalUtils.describeAnimal(cat) == "Cat says: Meow! and I am walking.")
  }
}

