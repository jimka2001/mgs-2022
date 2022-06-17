package calculus
import scala.math.{pow, Pi, abs}
                                                                                                             
object proj2 {
  def prob1(epsilon: Double): Int = {
    def recur(SumSoFar: Double, n: Int): Int = {
      if (abs(SumSoFar - Pi * Pi / 6) < epsilon)
        n
      else
        recur(SumSoFar + 1.0 / (n * n), n + 1)
    }

    recur(0.0, 1)
  }

  def main(argv: Array[String]): Unit = {
    println(prob1(0.1))
    println(prob1(0.0001))
  }
}
