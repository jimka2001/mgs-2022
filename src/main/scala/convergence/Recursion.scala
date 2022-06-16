package convergence

object Recursion {
  // sum of list of Int
  def sumListOfInt(items: List[Int]): Int = {
    if (items == List())
      0
    else
      items.head + sumListOfInt(items.tail)
  }

  // product of a list of Double
  def productListOfDouble(items: List[Double]): Double = {
    if (items == List())
      1.0
    else
      items.head * productListOfDouble(items.tail)
  }

  def sumIntBetween(lower: Int, upper: Int): Int = {
    if (lower == upper)
      upper
    else
      lower + sumIntBetween(lower + 1, upper)
  }

  def sumIntBetween2(lower: Int, upper: Int): Int = {
    def recur(left: Int, sumSoFar: Int): Int = {
      if (left == upper)
        left + sumSoFar
      else
        recur(left + 1, sumSoFar + left)
    }
    recur(lower, 0)
  }

  def removeFromList[T](items: List[T], deleteMe: T): List[T] = {
    ???
  }

  def removeOnce[T](items: List[T], deleteMe: T): List[T] = {
    if (items == List())
      items
    else if (items.head == deleteMe)
      items.tail
    else
      items.head :: removeOnce(items.tail, deleteMe)
  }

  def removeOnce2[T](
      items: List[T],
      deleteMe: T,
      done: List[T] = List[T]()
  ): List[T] = {
    if (items == List())
      done
    else if (items.head == deleteMe)
      items.tail ++ done
    else
      removeOnce2(items.tail, deleteMe, items.head :: done)
  }

  val students = List(
    "Drew",
    "Thomas",
    "Jasmine",
    "Gertrude",
    "Akhila",
    "Jaeho",
    "Gertrude",
    "Cole",
    "Gracyn",
    "Reagan",
    "Gertrude",
    "Rachele",
    "Sydney"
  )

  def main(argv: Array[String]): Unit = {

    // println(sumListOfInt(List(1, 3, 2, 5, 4, 3, 2, 3, -4)))
    // println(productListOfDouble(List(1.1,2.2,3.3,-5.3)))
    println(removeOnce2(students, "Gertrude"))
    // println(sumIntBetween(1,10))
    // println(sumIntBetween(10,10))
    // println(sumIntBetween2(10,1000000))
  }
}
