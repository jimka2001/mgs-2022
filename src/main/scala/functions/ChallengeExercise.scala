package functions

import simulacrum.typeclass

object ChallengeExercise{

    def triples(m:Int, n:Int, o:String) = {
        if (o == "all")
            for{a <- (m to n)
                b <- (m to n)
                if (a < b)
                    c <- (m to n)
                    if (a*a + b*b == c*c)}
                        yield List(a, b, c)
        else if (o == "reduced")
            for{ a <- (m to n)
                 b <- (m to n)
                 if (a < b)
                    c <- (m to n)
                    d <- (m to n)
                     if (a*a + b*b == c*c)
                        if (a < b)
                            if !((a / d).isValidInt) 
                                yield List(a, b, c)
                            else if !((b / d).isValidInt)
                                yield List(a, b, c)
                            else if !((c / d).isValidInt)}
                                yield List(a, b, c)
        else
            List(List())
    }

    def main(argv: Array[String]): Unit = {
        println("Here are all the pyathagorean triples between 1 and 100.")
        println(triples(1, 100, "all"))
        println("Here are just the reduced forms.")
        println(triples(1, 100, "reduced"))
    }
}
