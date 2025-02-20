package Assignment10

object DescribeType {
  def describe(x: Any): String = x match {
    case i: Int => "This is an Integer"
    case s: String => "This is a String"
    case d: Double => "This is a Double"
    case l: List[_] => "This is a List"
    case _ => "Unknown type"
  }
}

