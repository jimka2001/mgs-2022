package convergence

import scala.math.log
import scala.math.abs
object extraSpicySufferring{

    def myfun(epsilon: Double):Int = {
        
        def recure(sumSoFar: Double, n: Int): Int = {

            def power(b: Int, n: Int): Double = {
                if (n % 2 == 0)
                    -1
                else
                    1
            }

            var maybe = power(-1, n) / n
            if (abs(((maybe + sumSoFar) - log(2))) < epsilon)
                n
            else
                recure(sumSoFar + maybe, n + 1)

        }

        recure(0, 1)
    }

    def main(argv: Array[String]): Unit = {
        println(myfun(0.1))
    }

}
