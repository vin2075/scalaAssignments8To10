package Assignment8


class Hybrid extends Flying with Swimming {
  override def move(): String = super[Swimming].move()  // Resolving conflict by choosing Swimming trait
}
