package Assignment10

object NumberClassifier {
  def classifyNumber(n: Int): String = n match {
    case x if x % 2 == 0 && x < 10  => "small even"
    case x if x % 2 == 0 && x >= 10 => "large even"
    case x if x % 2 != 0 && x < 10  => "small odd"
    case x if x % 2 != 0 && x >= 10 => "large odd"
  }
}

