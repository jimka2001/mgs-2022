package calculus

import scala.math.{pow, Pi, abs}

object InfinitePain {

 def addsum(n: Int): Double = {
    if (n == 1)
      pow(-1, n) / ((2 * n) - 1)
    else
      pow(-1, n) / ((2 * n) - 1) + addsum(n - 1)

  } 

  def myfun(epsilon: Double, n:Int): Int = {
      println(addsum(n))
   if (abs(addsum(n) + Pi/4) < epsilon)
    n
   else
    myfun(epsilon, n + 1)
  }

  def main(args: Array[String]) = {
      print(myfun(0.0001, 1))
  }
}
