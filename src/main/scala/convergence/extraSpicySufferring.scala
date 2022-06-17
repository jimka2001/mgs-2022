package convergence

import scala.math.log
import scala.math.abs
object extraSpicySufferring{
    
    /*def myfun(epsilon: Double):Int = {
        
        def powerInt(b: Int, n: Int):Int = {
            if (n % 2 == 0)
                1
            else
                -1
        }

        def summation(n: Int):Double ={
            (powerInt(-1, n + 1).toDouble) / n
        }

        def recursive(sumSoFar: Double, n: Int): Int = {
            var term = (summation(n) + sumSoFar) - log(2.0)
            if (term > epsilon){
                println(sumSoFar)
                recursive(sumSoFar + term, n + 1)
            }
            else
                n
        }

        recursive(0, 1)       
    }

    def main(argv: Array[String]): Unit = {
        println(myfun(0.001))
    }*/

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
