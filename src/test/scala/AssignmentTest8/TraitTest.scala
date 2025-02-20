import org.scalatest.funsuite.AnyFunSuite
import Assignment8.{Duck,Penguin}
class TraitTest extends AnyFunSuite {

  test("Duck should be able to fly and swim") {
    val duck = new Duck
    assert(duck.fly() == "Duck is flying!")
    assert(duck.swim() == "Duck is swimming!")
    assert(duck.move() == "Flying in the air") // Ensuring conflict resolution
  }

  test("Penguin should be able to swim but not fly") {
    val penguin = new Penguin
    assert(penguin.swim() == "Penguin is swimming!")
  }
}
