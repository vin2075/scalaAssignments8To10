package Assignment9

package animals

import traits.{Speakable, Walkable}

class Cat extends Speakable with Walkable {
  override def speak(): String = "Meow!"
}

