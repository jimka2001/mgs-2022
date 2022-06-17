package convergence

object Factors {

  def factorSearch(n: Int, k: Int, done: List[Int]): List[Int] = {
    // recursively find factors of n, each time k is found to
    // be a factor is, prepend k onto done, if k not a factor,
    // increment k
    if (n == 1)
      done
    else if (n % k == 0)
      factorSearch(n / k, k, k :: done)
    else
      factorSearch(n, k + 1, done)
  }

  def factors(n: Int): List[Int] = {
    factorSearch(n, 2, List())
  }

  def factorsOfFactorial(n: Int): List[Int] = {
    // return a list of the factors of n!
    for {
      a <- (2 to n).toList
      f <- factors(a)
    } yield f
  }

  def cancel(
      nFactors: List[Int],
      dFactors: List[Int]
  ): List[Int] = {
    import Recursion.removeOnce
    if (dFactors == List())
      nFactors
    else
      cancel(removeOnce(nFactors, dFactors.head), dFactors.tail)
  }

  def choose(n: Int, k: Int): Int = {
    // compute number of combinations of n things taken k at a time.
    // we do this by expanding all the factors and canceling,
    // finally multiplying the reduced numerator
    val nFactors = factorsOfFactorial(n)
    val dFactors = factorsOfFactorial(k) ++ factorsOfFactorial(n - k)

    val remaining = cancel(nFactors, dFactors)

    remaining.product
  }

  def main(argv: Array[String]): Unit = {
    import functions.Factorial.factorial

    for { n <- 2 to 100 } {
      println(s"$n --> ${factors(n)}")
      println(s"     $n! --> ${factorsOfFactorial(n)}")
    }
    for {
      n <- 2 to 20
      k <- 1 to n
      c1 = choose(n, k)
      c2 = factorial(n) / (factorial(k) * (factorial(n - k)))
      if c1 != c2
    } println(s"n=$n k=$k c1=$c1 c2=$c2")
  }
}
