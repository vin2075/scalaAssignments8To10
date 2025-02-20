package AssignmentTest10

import Assignment10.{DescribeType,PersonMatch,NumberClassifier,Person}
import org.scalatest.funsuite.AnyFunSuite

class PatternMatchingTest extends AnyFunSuite {

  test("DescribeType should return correct type descriptions") {
    assert(DescribeType.describe(10) == "This is an Integer")
    assert(DescribeType.describe("hello") == "This is a String")
    assert(DescribeType.describe(5.5) == "This is a Double")
    assert(DescribeType.describe(List(1, 2, 3)) == "This is a List")
    assert(DescribeType.describe(true) == "Unknown type")
  }

  test("PersonMatch should extract correct details") {
    val person = Person("Alice", 25)
    assert(PersonMatch.personDetails(person) == "Name: Alice, Age: 25")
  }

  test("NumberClassifier should classify numbers correctly") {
    assert(NumberClassifier.classifyNumber(2) == "small even")
    assert(NumberClassifier.classifyNumber(15) == "large odd")
    assert(NumberClassifier.classifyNumber(8) == "small even")
    assert(NumberClassifier.classifyNumber(20) == "large even")
    assert(NumberClassifier.classifyNumber(7) == "small odd")
  }
}

