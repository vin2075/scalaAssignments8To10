package Assignment8



class Duck extends Flying with Swimming {
  override def fly(): String = "Duck is flying!"
  override def swim(): String = "Duck is swimming!"

  // Resolve conflict by explicitly choosing Flying's move method
  override def move(): String = super[Flying].move()
}
