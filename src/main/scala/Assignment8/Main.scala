package Assignment8

object Main extends App {
  val duck = new Duck
  println(duck.fly())   // Output: Duck is flying!
  println(duck.swim())  // Output: Duck is swimming!
  println(duck.move())  // Output: Flying in the air (resolved from Flying)

  val penguin = new Penguin
  println(penguin.swim()) // Output: Penguin is swimming!
}

