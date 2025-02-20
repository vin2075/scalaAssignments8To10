package Assignment9

package animals

import traits.{Speakable, Walkable}

class Dog extends Speakable with Walkable {
  override def speak(): String = "Woof!"
}

