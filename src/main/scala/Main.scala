// la
/* la-la
*/

object Main extends App {

  // Create float and char
  val floatVariable = 2.0f
  val charVariable = 'c'

  println(floatVariable)
  println(charVariable)

  // Create Set of Int, List of Strings, Seq of Ints and Strings

  val setOfInts = Set(1, 2, 4)
  val setOfStrings = List("who", "where", "when", "why")
  val segOfIntsAndStrings = Seq(1, "who", 2, "where")

  println(setOfInts)
  println(setOfStrings)
  println(segOfIntsAndStrings)

  // Exercise no. 1: Implement a function that given a string returns -1 if string is empty and half its length otherwise.
  def halfOf(str: String): Int = {
    if(str.isEmpty) -1 else str.length / 2
  }

  println(halfOf("UniversityofToronto"))

  // Implement a function that gets one integer and two functions, applies first function to the given integer, then second function to that and then returns the result.
  def compose(f: Int => Int, g: Int => Int, x: Int) = g(f(x))

  println(compose( x=>x*2, y=>y*5,5))

  // Exercise no. 3.1: Implement a function that gets one integer and returns a function that gets one double and sums previous integer and double.
  def intPlusDouble(x: Int) = (y: Double) => x + y

  println(intPlusDouble(100)(50))

  // Exercise no. 3.2: Implement a function that returns a function that gets a double and return the same double using previous function.
  def zeroPlusDouble(): Double => Double = (z: Double) => intPlusDouble(0)(z)

  println(zeroPlusDouble()(5.5))

  // Exercise no. 4: Implement a function that gets an optional integer and returns its optional value doubled.
  def doubleMe(x: Option[Int]) = x.map(_ * 2)

  println(doubleMe(Option(5)))

  // Exercise no. 5:

  // Question: What does`divide(2,4)`return?
  // Answer: 0 and it is of type Int

  // Question: What does`divide(1,0)`return?
  // Answer: "Hmm ..." and it is of type String

  // Question: What i sreturn type of`divide`?
  // Answer: Any

  // Question: What is the difference between try/catch and Try?
  // Answer: Try is more type safe, easier to use and more of a best practice

  // Exercise no. 6: In how many different ways one can create a tuple2 in Scala?
  // Answer: you tell me when I come back :)

  // Exercise no. 7:

  // 1. Create a class orange with weight and origin.
  case class Orange(weight: Double, origin: String)

  // 2.Instantiate two oranges with same characteristics.
  val orange = Orange(1, "Morocco")
  val orange2 = Orange(1, "Morocco")
  val compareOranges = orange == orange2
  // 3.Compare them. What do you get?
  // compareOranges: Boolean = true
  // 4.Copy the first orange but change its weight.
  val orange3 = orange.copy(weight = 2)
  // 5.Compare the original orange with its modified copy. What do you get?
  val compareOranges2 = orange == orange3
  // compareOranges2: Boolean = false

  // Exercise no. 8: Implement a function that gets `Any` and pattern matches on tuple2 returning string containing the tuple's members, some other string otherwise.
  def matchMe(any: Any) = any match {
    case (f,g) => s"$f and $g"
    case x:Int => s"I'm a number $x"
    case x:Orange => s"I'm an Orange $x"
    case _ => "Not a tuple2 -:("
  }

  // Exercise no. 9: the answers are on slides

  // Exercise no. 10: advise Scala collections API documentation online


  //testing orange class
  val OrangeNew = Orange(1.25,"Toronto")
  println(matchMe((4,5)))
  println(matchMe((OrangeNew, orange2)))
  println(matchMe(orange))
  println(matchMe(5))

}














