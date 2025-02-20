package Assignment9

package utils

import animals.{Dog, Cat}

object AnimalUtils {
  def describeAnimal(animal: Any): String = animal match {
    case d: Dog => s"Dog says: ${d.speak()} and ${d.walk()}"
    case c: Cat => s"Cat says: ${c.speak()} and ${c.walk()}"
    case _ => "Unknown animal"
  }
}

