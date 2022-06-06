package functions

object Factorial {

  // TASK:
  //      Implement factorial as a recursive model.  What is the base
  //      case of the recursion?   Experimentally determine what happens
  //      if the input to the factorial function is large.  What is the
  //      largest Int for which you can correctly compute the factorial?
  def factorial(n: Int): Int = {
    if (n == 0)
      1
    else
      // "factorial" is this function; it calls itself within the function. 
      // It'll keep calling itself until it reaches 0
      n * factorial(n - 1)
  }

  def main(argv: Array[String]): Unit = {
    println(factorial(5))
  }
}
