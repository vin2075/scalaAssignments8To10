package Assignment10

case class Person(name: String, age: Int)

object PersonMatch {
  def personDetails(person: Person): String = person match {
    case Person(name, age) => s"Name: $name, Age: $age"
  }
}

